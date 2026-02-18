package datastructures.treegraph.graph;

import java.util.*;

class Pair {
    int node, distance;
    Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

public class Dijkstra {
    public static int[] dijkstra(int V, List<List<Pair>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.distance - b.distance
        );

        dist[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();

            for (Pair neighbor : adj.get(current.node)) {
                int newDist = current.distance + neighbor.distance;

                if (newDist < dist[neighbor.node]) {
                    dist[neighbor.node] = newDist;
                    pq.add(new Pair(neighbor.node, newDist));
                }
            }
        }

        return dist;
    }
}
