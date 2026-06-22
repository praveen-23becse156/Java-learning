// server.js — Career Website backend
// Handles: signup, login, logout, quiz scoring, saving results
// Storage: a simple JSON file (data/users.json) — no external database needed.

const express = require("express");
const session = require("express-session");
const bcrypt = require("bcryptjs");
const fs = require("fs");
const path = require("path");

const app = express();
const PORT = process.env.PORT || 3000;
const DB_FILE = path.join(__dirname, "data", "users.json");

// ---------- tiny JSON "database" helpers ----------
function readUsers() {
  if (!fs.existsSync(DB_FILE)) return [];
  const raw = fs.readFileSync(DB_FILE, "utf-8").trim();
  return raw ? JSON.parse(raw) : [];
}
function writeUsers(users) {
  fs.writeFileSync(DB_FILE, JSON.stringify(users, null, 2));
}

// ---------- middleware ----------
app.use(express.json());
app.use(express.static(path.join(__dirname, "public")));
app.use(
  session({
    secret: "career-website-secret-change-me",
    resave: false,
    saveUninitialized: false,
    cookie: { maxAge: 1000 * 60 * 60 * 4 } // 4 hours
  })
);

function requireLogin(req, res, next) {
  if (!req.session.userEmail) {
    return res.status(401).json({ error: "Please log in first." });
  }
  next();
}

// ---------- streams data ----------
const STREAMS = {
  CSE: {
    code: "CSE",
    name: "Computer Science Engineering",
    blurb: "Software, algorithms, AI, web & app development.",
    careers: ["Software Developer", "Data Scientist", "AI/ML Engineer", "Cybersecurity Analyst"]
  },
  IT: {
    code: "IT",
    name: "Information Technology",
    blurb: "Systems, networks, databases, and IT infrastructure.",
    careers: ["System Administrator", "Cloud Engineer", "Database Admin", "IT Consultant"]
  },
  ECE: {
    code: "ECE",
    name: "Electronics & Communication Engineering",
    blurb: "Circuits, signal processing, communication systems, embedded devices.",
    careers: ["Embedded Systems Engineer", "VLSI Designer", "Telecom Engineer", "IoT Developer"]
  },
  EEE: {
    code: "EEE",
    name: "Electrical & Electronics Engineering",
    blurb: "Power systems, electrical machines, control systems.",
    careers: ["Power Engineer", "Control Systems Engineer", "Electrical Design Engineer"]
  },
  MECH: {
    code: "MECH",
    name: "Mechanical Engineering",
    blurb: "Machines, manufacturing, thermodynamics, design.",
    careers: ["Design Engineer", "Manufacturing Engineer", "Automotive Engineer", "Robotics Engineer"]
  },
  CIVIL: {
    code: "CIVIL",
    name: "Civil Engineering",
    blurb: "Buildings, infrastructure, construction, urban planning.",
    careers: ["Structural Engineer", "Site Engineer", "Urban Planner", "Construction Manager"]
  }
};

// 8 questions. Each option carries weight(s) toward stream codes.
const QUESTIONS = [
  {
    q: "Which activity sounds most fun to you?",
    options: [
      { text: "Writing code / building an app", weights: { CSE: 3, IT: 1 } },
      { text: "Taking apart a machine to see how it works", weights: { MECH: 3 } },
      { text: "Wiring a circuit or fixing a gadget", weights: { ECE: 3, EEE: 1 } },
      { text: "Sketching a building or planning a layout", weights: { CIVIL: 3 } }
    ]
  },
  {
    q: "Pick a school subject you enjoy most:",
    options: [
      { text: "Computer Science / Coding", weights: { CSE: 3, IT: 2 } },
      { text: "Physics (mechanics, motion, forces)", weights: { MECH: 2, EEE: 1 } },
      { text: "Physics (electricity & electronics)", weights: { ECE: 3, EEE: 2 } },
      { text: "Geography / Drawing / Maths (structures)", weights: { CIVIL: 3 } }
    ]
  },
  {
    q: "Your dream project would involve:",
    options: [
      { text: "Building a website or mobile app", weights: { CSE: 3, IT: 2 } },
      { text: "Designing a robot or vehicle", weights: { MECH: 3, ECE: 1 } },
      { text: "Designing a smart home / IoT device", weights: { ECE: 3, EEE: 1 } },
      { text: "Designing a bridge or building", weights: { CIVIL: 3 } }
    ]
  },
  {
    q: "Which tool would you rather master?",
    options: [
      { text: "A programming language (Python, Java, etc.)", weights: { CSE: 3, IT: 1 } },
      { text: "CAD software for mechanical parts", weights: { MECH: 3 } },
      { text: "Circuit simulation software", weights: { ECE: 3, EEE: 2 } },
      { text: "Structural design software", weights: { CIVIL: 3 } }
    ]
  },
  {
    q: "How do you like solving problems?",
    options: [
      { text: "Logical, step-by-step, on a screen", weights: { CSE: 2, IT: 2 } },
      { text: "Hands-on, with tools and machines", weights: { MECH: 2 } },
      { text: "Testing and measuring with instruments", weights: { ECE: 2, EEE: 2 } },
      { text: "Visualizing and planning on paper/site", weights: { CIVIL: 2 } }
    ]
  },
  {
    q: "Which career excites you the most?",
    options: [
      { text: "Software Developer / Data Scientist", weights: { CSE: 3 } },
      { text: "Automotive / Robotics Engineer", weights: { MECH: 3 } },
      { text: "IoT / Telecom Engineer", weights: { ECE: 3 } },
      { text: "Structural / Site Engineer", weights: { CIVIL: 3 } }
    ]
  },
  {
    q: "Pick a favorite type of YouTube video:",
    options: [
      { text: "App/game development tutorials", weights: { CSE: 2, IT: 1 } },
      { text: "Engine teardown / how machines work", weights: { MECH: 2 } },
      { text: "Electronics DIY / Arduino projects", weights: { ECE: 2, EEE: 1 } },
      { text: "Megastructures / how buildings are made", weights: { CIVIL: 2 } }
    ]
  },
  {
    q: "Where do you see yourself working?",
    options: [
      { text: "Tech company, remote-friendly office", weights: { CSE: 2, IT: 2 } },
      { text: "Factory / manufacturing plant", weights: { MECH: 2 } },
      { text: "Electronics / telecom company", weights: { ECE: 2, EEE: 2 } },
      { text: "Construction site / planning office", weights: { CIVIL: 2 } }
    ]
  }
];

app.get("/api/questions", (req, res) => {
  // send questions without revealing weights to keep it clean (optional)
  res.json(QUESTIONS.map(q => ({ q: q.q, options: q.options.map(o => o.text) })));
});

// ---------- auth routes ----------
app.post("/api/signup", (req, res) => {
  const { name, email, password } = req.body;
  if (!name || !email || !password) {
    return res.status(400).json({ error: "All fields are required." });
  }
  const users = readUsers();
  if (users.find(u => u.email.toLowerCase() === email.toLowerCase())) {
    return res.status(400).json({ error: "An account with this email already exists." });
  }
  const hashed = bcrypt.hashSync(password, 10);
  users.push({ name, email, password: hashed, results: [] });
  writeUsers(users);
  req.session.userEmail = email;
  res.json({ message: "Account created.", name });
});

app.post("/api/login", (req, res) => {
  const { email, password } = req.body;
  const users = readUsers();
  const user = users.find(u => u.email.toLowerCase() === (email || "").toLowerCase());
  if (!user || !bcrypt.compareSync(password || "", user.password)) {
    return res.status(401).json({ error: "Invalid email or password." });
  }
  req.session.userEmail = user.email;
  res.json({ message: "Logged in.", name: user.name });
});

app.post("/api/logout", (req, res) => {
  req.session.destroy(() => res.json({ message: "Logged out." }));
});

app.get("/api/me", (req, res) => {
  if (!req.session.userEmail) return res.json({ loggedIn: false });
  const users = readUsers();
  const user = users.find(u => u.email === req.session.userEmail);
  if (!user) return res.json({ loggedIn: false });
  res.json({ loggedIn: true, name: user.name, email: user.email, results: user.results });
});

// ---------- quiz submission ----------
app.post("/api/quiz/submit", requireLogin, (req, res) => {
  const { answers } = req.body; // array of option indices, one per question
  if (!Array.isArray(answers) || answers.length !== QUESTIONS.length) {
    return res.status(400).json({ error: "Please answer every question." });
  }

  const scores = { CSE: 0, IT: 0, ECE: 0, EEE: 0, MECH: 0, CIVIL: 0 };
  answers.forEach((optionIndex, qIndex) => {
    const option = QUESTIONS[qIndex].options[optionIndex];
    if (!option) return;
    Object.entries(option.weights).forEach(([stream, pts]) => {
      scores[stream] += pts;
    });
  });

  const ranked = Object.entries(scores).sort((a, b) => b[1] - a[1]);
  const topCode = ranked[0][0];
  const top = STREAMS[topCode];

  const users = readUsers();
  const user = users.find(u => u.email === req.session.userEmail);
  const resultEntry = {
    date: new Date().toISOString(),
    recommended: topCode,
    scores
  };
  user.results.unshift(resultEntry);
  writeUsers(users);

  res.json({
    recommended: top,
    scores: ranked.map(([code, pts]) => ({ ...STREAMS[code], points: pts }))
  });
});

app.get("/api/streams", (req, res) => {
  res.json(Object.values(STREAMS));
});

app.listen(PORT, () => {
  console.log(`Career Website running at http://localhost:${PORT}`);
});
