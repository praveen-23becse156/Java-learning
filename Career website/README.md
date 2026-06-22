# Career Website

A web app that helps students figure out which engineering stream fits them
(CSE, IT, ECE, EEE, Mechanical, Civil) through a short quiz tied to a
personal account.

## What it does

1. A student **creates an account** (signup) and **logs in**.
2. They take an **8-question quiz** about what they enjoy.
3. The app **scores their answers** and recommends a stream, with the
   careers it leads to.
4. Every result is **saved to their account**, so they can come back and
   see their history.

---

## What technology is used (and why)

| Layer | Technology | Purpose |
|---|---|---|
| **Structure** | HTML5 | The 5 pages: landing, signup, login, dashboard, quiz |
| **Styling (UI)** | CSS3 (custom, no framework) | Colors, layout, the badge/quiz UI — see `public/css/style.css` |
| **Frontend logic** | JavaScript (vanilla, no framework) | Handles forms, quiz flow, talking to the backend — `public/js/` |
| **Backend / server** | Node.js + Express.js | Serves the pages and handles signup/login/quiz API routes — `server.js` |
| **Authentication** | express-session + bcryptjs | Keeps users logged in (sessions) and stores passwords safely (hashed, never in plain text) |
| **Database** | A JSON file (`data/users.json`) | Stores accounts and quiz results — simple, no database server needed to get started |

This is a classic **3-tier web app**: HTML/CSS/JS in the browser (frontend) →
Express server (backend) → JSON file (storage). It's intentionally simple
so it's easy to read, extend, and explain in a project submission. Later you
can swap the JSON file for a real database (MongoDB, MySQL, etc.) without
changing the frontend.

### Project structure
```
career-website/
├── server.js              # backend: routes for signup/login/quiz
├── package.json            # lists dependencies (express, bcryptjs, express-session)
├── data/
│   └── users.json          # stores accounts + quiz results
└── public/                 # everything the browser loads
    ├── index.html           # landing page
    ├── signup.html
    ├── login.html
    ├── dashboard.html
    ├── quiz.html
    ├── css/style.css
    └── js/streams-data.js
```

---

## How to run it on your own computer

You need **Node.js** installed (download from https://nodejs.org — the LTS
version). It comes with `npm` automatically.

1. Unzip the project folder and open a terminal inside it.
2. Install the dependencies:
   ```
   npm install
   ```
3. Start the server:
   ```
   npm start
   ```
4. Open your browser at:
   ```
   http://localhost:3000
   ```

That's it — you can sign up, log in, and take the quiz locally. Accounts
are saved in `data/users.json` on your machine.

---

## How to put it on GitHub

1. **Create a GitHub account** at https://github.com if you don't have one.
2. **Create a new repository**:
   - Click the **+** icon (top right) → **New repository**.
   - Name it `career-website`.
   - Leave it **Public** (or Private, your choice).
   - Do **not** initialize with a README (you already have one) — just click **Create repository**.
3. **Push your project** from the terminal, inside the `career-website` folder:
   ```
   git init
   git add .
   git commit -m "Initial commit: Career Website"
   git branch -M main
   git remote add origin https://github.com/YOUR-USERNAME/career-website.git
   git push -u origin main
   ```
   (Replace `YOUR-USERNAME` with your actual GitHub username. GitHub will
   ask you to log in the first time — it's easiest to use a
   [Personal Access Token](https://github.com/settings/tokens) as your
   password if it's requested.)
4. Refresh your GitHub page — your code is now online. The `.gitignore`
   file makes sure `node_modules/` (a huge folder of installed packages)
   is **not** uploaded, which is normal practice.

### Letting someone else run it from GitHub
Anyone can now get your project with:
```
git clone https://github.com/YOUR-USERNAME/career-website.git
cd career-website
npm install
npm start
```

---

## How to host it online (optional, so it's not just "localhost")

GitHub itself only hosts **static** files for free (GitHub Pages), and this
project has a real backend (Node/Express), so GitHub Pages alone won't run
it. Easiest free options that work directly from your GitHub repo:

- **Render** (https://render.com) — connect your GitHub repo, choose
  "Web Service", set build command `npm install` and start command
  `npm start`. Free tier available.
- **Railway** (https://railway.app) — similar one-click deploy from GitHub.

Both will give you a public URL like `https://career-website.onrender.com`
that anyone can visit, with the GitHub repo as the source of truth — every
time you push new code, it redeploys automatically.

---

## Ideas to extend it later
- Add a "save favorite streams" feature.
- Add more/better quiz questions or weight them with a teacher's input.
- Add an admin view to see aggregate stats across all students.
- Replace the JSON file with a real database for many concurrent users.
