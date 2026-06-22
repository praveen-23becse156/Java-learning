// void Palindrome() 
//     {
//         if(head==null) 
//             return;
//         Node left=head;
//         Node right=head;

//         while(right.next!=null)
//             right=right.next;

//         while(left!=right && right.next!=left) 
//         {
//             if(left.data!=right.data)
//             {
//                 System.out.println("Not Palindrome");
//                 return;
//             }
//             left=left.next;
//             right=right.prev;
//         }
//         System.out.println("Palindrome");
        
//     }
    import java.util.*;//palindrom in doubly linkedlist
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
       void Palindrome() 
    {
        if(head==null) 
            return;
        Node left=head;
        Node right=head;

        while(right.next!=null)
            right=right.next;

        while(left!=right && right.next!=left) 
        {
            if(left.data!=right.data)
            {
                System.out.println("Not Palindrome");
                return;
            }
            left=left.next;
            right=right.prev;
        }
        System.out.println("Palindrome");
        
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
      public class doublylist7{  
        public static void main(String[]args){
            doublylinkedlist list = new doublylinkedlist();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                list.insert(sc.nextInt());
            }
            list.display();
            System.out.println();
            list.Palindrome();
             list.display();
        }
    }

