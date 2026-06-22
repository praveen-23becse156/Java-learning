//  void deleteBegin() 
//     {
//         if(head==null) 
//             return;
//         head=head.next;
//         if(head!=null)
//             head.prev=null;
//     }
    // void deletePos(int pos) 
    // {
    //     if(pos==1) 
    //     {
    //         deleteBegin();
    //         return;
    //     }

    //     Node temp=head;
    //     for(int i=1;i<pos && temp!=null;i++)
    //         temp=temp.next;

    //     if(temp==null) 
    //     {
    //         System.out.println("Invalid Position");
    //         return;
    //     }

    //     if(temp.next!=null)
    //         temp.next.prev=temp.prev;

    //     if(temp.prev!=null)
    //         temp.prev.next=temp.next;
    // }
    import java.util.*;//it will delete the position
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
    void deleteBegin() 
    {
        if(head==null) 
            return;
        head=head.next;
        if(head!=null)
            head.prev=null;
    }
        void deletePos(int pos) 
    {
        if(pos==1) 
        {
            deleteBegin();
            return;
        }

        Node temp=head;
        for(int i=1;i<pos && temp!=null;i++)
            temp=temp.next;

        if(temp==null) 
        {
            System.out.println("Invalid Position");
            return;
        }

        if(temp.next!=null)
            temp.next.prev=temp.prev;

        if(temp.prev!=null)
            temp.prev.next=temp.next;
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
      public class doublylist6{  
        public static void main(String[]args){
            doublylinkedlist list = new doublylinkedlist();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                list.insert(sc.nextInt());
            }
            list.display();
            System.out.println();
            list.deletePos(2);
             list.display();
        }
    }