import java.util.*;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 4)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4)));

        System.out.println(dfs(V,edges));
    }

    public static ArrayList<Integer> dfs(int V, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.size(); i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                visited[i] = true;
                s.push(i);

                while (!s.isEmpty()) {
                    int n = s.pop();
                    ans.add(n);

                    for (int it : adjList.get(n)) {
                        if (!visited[it]) {
                            visited[it] = true;
                            s.push(it);
                        }
                    }
                }
            }
        }

        return ans;
    }
}
