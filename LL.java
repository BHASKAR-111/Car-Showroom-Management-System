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
    
    public void insertFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head =newNode;
    }

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

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        LL obj=new LL();
        obj.insertFirst("krsiha");
        obj.insertFirst("Radha");

        obj.insertLast("Sita");
        obj.insertLast("Ram");
        obj.printList();
    }
}
