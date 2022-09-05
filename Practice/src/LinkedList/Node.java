package LinkedList;

public class Node {
    String data;
    public Node next;
    public Node previous;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + "'}";
    }
}
