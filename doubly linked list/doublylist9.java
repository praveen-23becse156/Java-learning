import java.util.*;
class Node{
    Node prev;
    int data;
    Node next;
    Node(int data){
        this.prev=null;
        this.data=data;
        this.next=null;
    }
}
class doublylinkedlist{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        } else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }temp.next=newNode;
             newNode.prev=temp;
        }
    }
        void palindrome(){
            if(head==null){
                System.out.println("Node is Empty");
                return;
            }else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                Node tail=temp;
                temp=head;
                while(temp.next!=null&&tail.prev!=null){
                    if(temp.data!=tail.data){
                        System.out.println("Not a Palindrome");
                        return;
                    }else{
                        temp=temp.next;
                        tail=tail.prev;
                    }
                    

                }
                System.out.println("Palindrome");
            }
        }
}
        public class doublylist9{
            public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                doublylinkedlist list=new doublylinkedlist();
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    list.insert(sc.nextInt());
                }
                // list.display();
                list.palindrome();
            }
        }