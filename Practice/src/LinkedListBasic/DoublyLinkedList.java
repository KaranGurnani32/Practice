package LinkedListBasic;

import LinkedList.Node;

public class DoublyLinkedList {

    //start : 100
    //100: data: kanishk (neighborAddress : 200)  ---->
    //200: data: karan (neighborAddress : 5000)  ---->
    //5000: data: tushar (neighborAddress : 0)

    //important pointers
    //start / top / first reference is necessary
    //end / rear / back can also be there as per requirement
    //data type of the data stored in the list is same
    //insertion and deletion is ideally fastest in this data structure - O(1)
    //applications : used in graphs and other problem solutions


    private Node2 start;

    private Node2 end;

    public DoublyLinkedList() {
        this.start = null;
        this.end = null;
    }

    public Boolean insertBegin(String input) {

        Node2 currentNode = new Node2(input);

        if (start == null) {

            start = currentNode;
            end = currentNode;
            return true;
        }

        start.previous = currentNode;

        currentNode.next = start;

        start = currentNode;
        return true;
    }

    public Boolean insertEnd(String input) {

        Node2 currentNode = new Node2(input);

        if (start == null) {

            start = currentNode;
            end = currentNode;
            return true;
        }

        end.next = currentNode;

        currentNode.previous = end;

        end = currentNode;
        return true;
    }

    public void print() {
        System.out.println("----------------------------------------");
        Node2 currentNode = start;

        while (currentNode != null) {
            System.out.println("currentNode = " + currentNode);
            currentNode = currentNode.next;
        }
        System.out.println("----------------------------------------");
    }

    public void reversePrint() {
        System.out.println("----------------------------------------");
        Node2 currentNode = end;

        while (currentNode != null) {
            System.out.println("currentNode = " + currentNode);
            currentNode = currentNode.previous;
        }
        System.out.println("----------------------------------------");
    }

    public void insertAfterNode(String input, Node2 currentNode) {

        Node2 node = new Node2(input);

        if (currentNode == null) {
            System.out.println("It can't be null");
        }

        node.next = currentNode.next;
        currentNode.next = node;
        node.previous = currentNode;

        if (node.next != null) {
            node.next.previous = node;
        }

    }
}
