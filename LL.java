public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    

    // insert at last
    public void insertFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head =newNode;
    }

    //inser at last
    public void insertLast(String data){
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

    // Print the linked list
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    // Delete at First
    public void DeleteFirst(){
        if(head==null){
            System.out.println("The list is empty:(");
            return;
        }

        head=head.next;
    }

    // Delete at last
    public void DeleteLast(){
        if(head==null){
            System.out.println("The list is empty:(");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;//if head.next==null
        while(lastNode.next!=null){//null.next
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public static void main(String[] args) {
        LL obj=new LL();
        obj.insertFirst("krsiha");
        obj.insertFirst("Radha");

        obj.insertLast("Sita");
        obj.insertLast("Ram");

        obj.DeleteFirst();

        obj.DeleteLast();
        obj.printList();
    }
}
