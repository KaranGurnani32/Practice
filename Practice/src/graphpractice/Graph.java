package graphpractice;

import java.util.*;

public class Graph {

    Map<Node, List<Node>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    void addEdge(Node source, Node destination) {
        if (adjacencyList.containsKey(source)) {
            adjacencyList.get(source).add(destination);
        } else {
            adjacencyList.put(source, new LinkedList<>());
            adjacencyList.get(source).add(destination);
        }
    }

    List<Node> bfs(Node source) {
        Set<Node> visited = new HashSet<>();

        List<Node> result = new LinkedList<>();

        Queue<Node> queue = new LinkedList<>();

        queue.offer(source);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
            }
            for (Node neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }
        }

        return result;
    }

    List<Node> dfs(Node source) {

        Set<Node> visited = new HashSet<>();

        List<Node> result = new LinkedList<>();

        Stack<Node> stack = new Stack<>();

        stack.push(source);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
            }
            for (Node neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)){
                    stack.push(neighbour);
                }
            }

        }
        return result;
    }

    void printGraph() {
        System.out.println("-----------------------");
        for (Map.Entry entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.addEdge(new Node("Karan"), new Node("Kanishk"));
        graph.addEdge(new Node("Karan"), new Node("Akkshay"));
        graph.addEdge(new Node("Karan"), new Node("DJ"));
        graph.addEdge(new Node("Karan"), new Node("Chintu"));
        graph.addEdge(new Node("Kanishk"), new Node("Pragati"));
        graph.addEdge(new Node("Kanishk"), new Node("DJ"));
        graph.addEdge(new Node("Kanishk"), new Node("Radhika"));
        graph.addEdge(new Node("Radhika"), new Node("Muskan"));
        graph.addEdge(new Node("Radhika"), new Node("Pragati"));
        graph.addEdge(new Node("Pragati"), new Node("Kanishk"));
        graph.addEdge(new Node("Pragati"), new Node("Karan"));
        graph.addEdge(new Node("DJ"), new Node("Karan"));
        graph.addEdge(new Node("DJ"), new Node("Kanishk"));
        graph.addEdge(new Node("DJ"), new Node("Pragati"));
        graph.addEdge(new Node("Akkshay"), new Node("Karan"));
        graph.addEdge(new Node("Akkshay"), new Node("Kanishk"));
        graph.addEdge(new Node("Akkshay"), new Node("Chintu"));
        graph.addEdge(new Node("Chintu"), new Node("Karan"));
        graph.addEdge(new Node("Muskan"), new Node("Karan"));

        graph.printGraph();

        System.out.println(graph.bfs(new Node("Karan")));
        System.out.println(graph.dfs(new Node("Karan")));

    }
}
