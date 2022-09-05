package LinkedListBasic;

public class Node2 {
    String data;

    Node2 next;
    Node2 previous;

    public Node2(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                '}';
    }
}
