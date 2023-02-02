package graphpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphInterior {
    /*
    -> For number of nodes, nodeCount is declared
    -> We declare adjacency List and matrix (data type acc to question)
    -> In Constructor we take nodeCount and instantiate adjacency List and matrix
    -> We make a method to add edges either unidirectional or bidirectional b/w 2 nodes
    -> For BFS we take visited and result list for checking node is already visited or not
    -> Then we make a queue and then add a node and set it to visited
    -> Make a loop where node is pulled out of queue if queue is not empty
    -> If that node is not visited the add it to result and set its visit status as true
    -> If it is visited then add its neighbor to queue
    -> return the result
    -> Follow same steps for dfs just use stack instead of queue
    * */

    int nodeCount;

    ArrayList<LinkedList<Integer>> adjacencyList;

    int [][] adjacencyMatrix;

    public GraphInterior(int nodeCount) {
        this.nodeCount = nodeCount;

        adjacencyList = new ArrayList<>();
        for (int i = 0; i < nodeCount; i++) {
            adjacencyList.add(new LinkedList<Integer>());
        }

        adjacencyMatrix = new int[nodeCount][nodeCount];
    }

    void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);

        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    ArrayList<Integer> bfs(int source) {

        ArrayList<Boolean> visited = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < nodeCount; i++) {
            visited.add(false);
        }

        int current = source;
        queue.offer(current);
        visited.set(current, true);

        while (!queue.isEmpty()) {
            current = queue.poll();
            if (!visited.get(current)) {
                result.add(current);
                visited.set(current, true);
            }
            for(Integer neighbour: adjacencyList.get(current)) {
                if(!visited.get(neighbour)) {
                    queue.offer(neighbour);
                }
            }
        }
        return result;
    }

}
