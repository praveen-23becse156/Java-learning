import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
      }  
    }
    class singlelylinkedlist{
        Node head;
        void insert(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        void findmid(){
            if(head==null){
                System.out.println("Node is empty");
                return;
            }
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }  
        }
        public class singlelylist{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            singlelylinkedlist list=new singlelylinkedlist();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                list.insert(sc.nextInt());
            }
            list.display();
            list.findmid();
        }
    }

