package graphpractice;

import java.util.Objects;

public class Node { // Created Node as a data type so that we can use whatever
                    // data type inside it like int or String
    String data;

    public Node(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return data ;
    }
}
