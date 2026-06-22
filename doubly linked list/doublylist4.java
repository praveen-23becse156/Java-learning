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
        }else{
       Node temp=head;
       while(temp.next!=null){
        temp=temp.next;
       }temp.next=newNode;
       newNode.prev=temp;
       }
    }
    void reverse(){
        Node curr=head;
        Node temp=null;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
    }
    if(temp!=null){
        head=temp.prev;
    }
}
        void display(){
            if(head==null){
                System.out.println("Node is empty");
                return;
            }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        }
}
      public class doublylist4{  
        public static void main(String[]args){
            doublylinkedlist list = new doublylinkedlist();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                list.insert(sc.nextInt());
            }
            list.display();
            list.reverse();
            list.display();
        }
    }