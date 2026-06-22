import java.util.*;// mid elment:30,40,50
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
       }
    }
    void findmid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
        void display(){
            if(head==null){
                System.out.print("Node is empty");
                return;
            }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        }
}
      public class doublylist3{  
        public static void main(String[]args){
            doublylinkedlist list = new doublylinkedlist();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                list.insert(sc.nextInt());
            }
            list.display();
            list.findmid();
        }
    }