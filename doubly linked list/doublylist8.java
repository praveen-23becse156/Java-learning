import java.util.*;
class Node{
    Node prev=null;
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
    }else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }temp.next=newNode;
        newNode.prev=temp;
       }
   }
    void circular(){
        if(head==null){
            return;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
            head.prev=temp;
        
        if(temp.next==head&&head.prev==temp){
            System.out.println("It is Circular ");
        }else{
            System.out.println("It is not a Circular ");
        }
    }
    }
    void display(){
        if(head==null){
            System.out.println("Node is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}   
    public class doublylist8{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            doublylinkedlist list=new doublylinkedlist();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                list.insert(sc.nextInt());
            }
             list.display();
             list.circular();
        }
    }

