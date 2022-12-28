//package graphpractice;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class GraphPractice {
//
//    int nodeCount;
//
//    ArrayList<LinkedList<Integer>> adjacencyList;
//
//    int[][] adjacencyMatrix;
//
//    public GraphPractice(int nodeCount) {
//        this.nodeCount = nodeCount;
//        //List
//        adjacencyList = new ArrayList<>();
//        for (int i = 0; i < nodeCount; i++) {
//            adjacencyList.add(new LinkedList<Integer>());
//        }
//
//        //Matrix
//        adjacencyMatrix = new int[nodeCount][];
//        for (int i = 0; i < nodeCount; i++) {
//            adjacencyMatrix[i] = new int[nodeCount];
//        }
//    }
//
//    void addEdge(int source, int destination) {
//        adjacencyList.get(source).add(destination);
//        adjacencyList.get(destination).add(source);
//
//        adjacencyMatrix[source][destination] = 1;
//        adjacencyMatrix[destination][source] = 1;
//
//        System.out.println("-------------------------------------------");
//        System.out.println("edge added (" + source + ", " + destination + ")");
//        System.out.println("edge added (" + destination + ", " + source + ")");
//        System.out.println("-------------------------------------------");
//    }
//
//    ArrayList<Integer> bfs(int source) {
//        // Using Queue
//        ArrayList<Boolean> visited = new ArrayList<>();
//        ArrayList<Boolean> sequence = new ArrayList<>()
//        for (int i = 0; i < nodeCount; i++) {
//            visited.add(false);
//        }
//    }
//}
