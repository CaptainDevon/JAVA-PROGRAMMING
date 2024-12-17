import java.util.*;
public class BreadthFirstSearch {
    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 4)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4)));

        System.out.println(bfs(V,edges));

    }

    public static ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>>edges)
    {
        ArrayList<Integer>result=new ArrayList<>();
        boolean[] visited=new boolean[V];
        ArrayList<ArrayList<Integer>>adjList=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<edges.size();i++)
        {
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                q.offer(i);

                while(!q.isEmpty())
                {
                    int n=q.poll();
                    result.add(n);

                    for(int it:adjList.get(n))
                    {
                        if(!visited[it])
                        {
                            visited[it]=true;
                            q.offer(it);
                        }
                    }
                }
            }
        }

        return result;
    }
}
