package LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertBegin("kanishk");
        list.insertBegin("karan");
        list.insertBegin("tushar");
        list.insertEnd("kunal");
        list.insertEnd("vinay");
        list.insertEnd("pooja");
        list.insertEnd("pragati");

        list.print();
        list.reversePrint();
    }
}
