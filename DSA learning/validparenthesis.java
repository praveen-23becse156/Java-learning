import java.util.Scanner;

class Node
{
    char data;
    Node addr;
    Node(char value)
    {
        this.data=value;
        this.addr=null;
    }
}
class stack
{
    Node top;
    stack()
    {
        top=null;
    }
    void push(char val)
    {
        Node newNode=new Node(val);
        newNode.addr=top;
        top=newNode;
    }
    char pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty...");
        }

        char popped=top.data;
        top=top.addr;
        return popped;
    }

    boolean isMatch(char open,char close)
    {
        if(open=='(' && close==')')
            return true;
        if(open=='[' && close==']')
            return true;
        if(open=='{' && close=='}')
            return true;
        return false;
    }

    boolean isBalanced(String exp)
    {
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{')
            {
                push(ch);
            }
            else if(ch==')' || ch==']' || ch=='}')
            {
                if(top==null)
                    return false;

                char open=pop();
                if(!isMatch(open, ch))
                    return false;
            }
        }
        return top==null;
    }
}
public class validparenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        String str=sc.nextLine();
        if(s.isBalanced(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
 