package com.snake;

import java.util.*;

class Graph {
    private Map<Integer, List<Edge>> adjacencyList = new HashMap<>();

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.computeIfAbsent(source, ArrayList::new).add(new Edge(destination, weight));
        adjacencyList.computeIfAbsent(destination, ArrayList::new).add(new Edge(source, weight));
    }

    public Map<Integer, Integer> shortestPath(int start) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        Map<Integer, Integer> distances = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        priorityQueue.offer(new Node(start, 0));
        distances.put(start, 0);

        while (!priorityQueue.isEmpty()) {
            Node current = priorityQueue.poll();
            if (visited.contains(current.vertex)) {
                continue;
            }

            visited.add(current.vertex);

            for (Edge neighbor : adjacencyList.getOrDefault(current.vertex, Collections.emptyList())) {
                if (!visited.contains(neighbor.destination)) {
                    int newDistance = distances.get(current.vertex) + neighbor.weight;
                    if (newDistance < distances.getOrDefault(neighbor.destination, Integer.MAX_VALUE)) {
                        distances.put(neighbor.destination, newDistance);
                        priorityQueue.offer(new Node(neighbor.destination, newDistance));
                    }
                }
            }
        }

        return distances;
    }

    private static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(distance, other.distance);
        }
    }
}

public class DijkstraNavigator {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 1);

        int startVertex = 0;
        Map<Integer, Integer> shortestDistances = graph.shortestPath(startVertex);

        System.out.println("Shortest distances from vertex " + startVertex + ":");
        for (Map.Entry<Integer, Integer> entry : shortestDistances.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
