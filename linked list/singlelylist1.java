import java.util.Scanner; //single linked list (crrt code)(10-20-30)insert at last
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
            if(head==null)
            {
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        }
    }
        public class singlelylist1{
        public static void main(String[]args){
            singlelylinkedlist list = new singlelylinkedlist();
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.display();
        }
    }

    