public class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++; 
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
        System.out.println("NULL");
    }

    // Delete at First
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty:(");
            return;
        }

        size--;
        head=head.next;
    }

    // Delete at last
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty:(");
            return;
        }

        size--;
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

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL obj=new LL();
        obj.insertFirst("ram");
        obj.insertFirst("sita");
        obj.printList();

        obj.insertLast("Radha");
        obj.insertLast("krishna");
        obj.printList();

        obj.deleteFirst();
        obj.printList();

        obj.deleteLast();
        obj.printList();

        System.out.println(obj.getSize());

        obj.insertFirst("sita");
        obj.printList();
        System.out.println(obj.getSize());
    }
}
