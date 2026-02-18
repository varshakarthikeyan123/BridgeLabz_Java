package datastructures.treegraph.graph;

public class ConnectedComponents {
    public static int countComponents(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
}
