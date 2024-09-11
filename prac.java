public class prac {
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
        head=newNode;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        if(head!=null){

            System.out.print("NULL");
        }
    }
    public void deleteFirst(){
        if(head==null){
            head=null;
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;//head.next==null
        while(lastNode.next!=null){//null.next
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }
    public static void main(String[] args) {
        prac obj=new prac();
        obj.insertFirst("ram");
        obj.printList();
        obj.insertFirst("sita");
        obj.printList();

    }
}
