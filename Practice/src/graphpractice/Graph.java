package graphpractice;

import java.util.*;

public class Graph {
    /*
    * Make adjacency list, choose data type acc to question
    * Add default constructor
    * Creating method to add edges
    * printing the list
    * Creating main method and adding edges
    * To further make it a weighted graph we need to declare another variable
    * In this the edges are not same
    * We need to initialize it in constructor
    * make code for weighted edges
    * add code for printing it
    * */

    Map<Node, List<Node>> adjacencyList;

    Map<Edge, Integer> cost;

    public Graph() { // Creating default constructor (it gets invoked automatically)
        this.adjacencyList = new HashMap<>(); // initializing adjacency list
        this.cost = new HashMap<>(); // initializing cost
    }

    void addEdge(String sourceString, String destinationString, Integer weight) {
        Node source = new Node(sourceString);
        Node destination = new Node(destinationString);
        if (adjacencyList.containsKey(source)) {
            adjacencyList.get(source).add(destination);
        } else {
            adjacencyList.put(source, new LinkedList<>());
            adjacencyList.get(source).add(destination);
        }

        Edge edge = new Edge(source, destination);
        cost.put(edge, weight);
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

    void printAdjacencyList() {
        System.out.println("-----------------------");
        for (Map.Entry<Node, List<Node>> entry : adjacencyList.entrySet()) {
            Node key = entry.getKey();
            StringBuilder valueString = new StringBuilder();
            for (Node value : entry.getValue()) {
                valueString.append(value).append("(").append(cost.get(new Edge(key, value))).append("), ");
            }
            System.out.println(key + " --> " + valueString);
        }
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Graph graph = new Graph();


//        graph.addEdge(new Node("Karan"), new Node("Kanishk"));
//        graph.addEdge(new Node("Karan"), new Node("Akkshay"));
//        graph.addEdge(new Node("Karan"), new Node("DJ"));
//        graph.addEdge(new Node("Karan"), new Node("Chintu"));
//        graph.addEdge(new Node("Kanishk"), new Node("Pragati"));
//        graph.addEdge(new Node("Kanishk"), new Node("DJ"));
//        graph.addEdge(new Node("Kanishk"), new Node("Radhika"));
//        graph.addEdge(new Node("Radhika"), new Node("Muskan"));
//        graph.addEdge(new Node("Radhika"), new Node("Pragati"));
//        graph.addEdge(new Node("Pragati"), new Node("Kanishk"));
//        graph.addEdge(new Node("Pragati"), new Node("Karan"));
//        graph.addEdge(new Node("DJ"), new Node("Karan"));
//        graph.addEdge(new Node("DJ"), new Node("Kanishk"));
//        graph.addEdge(new Node("DJ"), new Node("Pragati"));
//        graph.addEdge(new Node("Akkshay"), new Node("Karan"));
//        graph.addEdge(new Node("Akkshay"), new Node("Kanishk"));
//        graph.addEdge(new Node("Akkshay"), new Node("Chintu"));
//        graph.addEdge(new Node("Chintu"), new Node("Karan"));
//        graph.addEdge(new Node("Muskan"), new Node("Karan"));

        graph.addEdge("Rithala","Rohini West", 5);
        graph.addEdge("Rohini West","Rohini East", 10);
        graph.addEdge("Rohini East","Peeragadhi", 25);
        graph.addEdge("Peeragadhi","Paschim Vihar", 15);
        graph.addEdge("Paschim Vihar","Karol Bagh", 20);

        graph.printAdjacencyList();

//        System.out.println(graph.bfs(new Node("Karan")));
//        System.out.println(graph.dfs(new Node("Karan")));

    }
}

class Edge {
    Node source;
    Node destination;

    public Edge(Node source, Node destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return source.equals(edge.source) && destination.equals(edge.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination);
    }
}
