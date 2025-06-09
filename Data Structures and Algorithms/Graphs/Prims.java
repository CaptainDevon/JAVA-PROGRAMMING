import java.util.*;
public class Prims {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of nodes=> ");
        int V=s.nextInt();
        System.out.print("Enter number of edges=> ");
        int E=s.nextInt();
        Map<Integer,List<Pair<Integer,Integer>>> graphMap=new HashMap<>();
        System.out.println("Enter the List of edges: ");
        while(E-->0)
        {
            int u=s.nextInt();
            int v=s.nextInt();
            int weight=s.nextInt();
            if(u<V && v<V && u!=v)
            {
                if(graphMap.containsKey(u)) graphMap.get(u).add(new Pair<>(v,weight));
                else
                {
                    graphMap.put(u,new ArrayList<>());
                    graphMap.get(u).add(new Pair<>(v,weight));
                }
                if(graphMap.containsKey(v)) graphMap.get(v).add(new Pair<>(u,weight));
                else
                {
                    graphMap.put(v,new ArrayList<>());
                    graphMap.get(v).add(new Pair<>(u,weight));
                }
            }
            else
            {
                System.out.println("out of bounds");
                E++;
            }
        }
        System.out.print("The minimum spanning tree of the graph is=> ");
        System.out.println(primsAlgorithm(V, graphMap));
        
        s.close();
    }

    public static int primsAlgorithm(int V,Map<Integer,List<Pair<Integer,Integer>>>graph)
    {
        int totalCost=0;
        boolean[] visited=new boolean[V];
        PriorityQueue<Pair<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(a -> a.second)
        );    
        
        minHeap.offer(new Pair<>(0,0));
        while (!minHeap.isEmpty()) 
        {
            Pair<Integer, Integer> current = minHeap.poll();
            int node = current.first;
            int weight = current.second;

            if (visited[node]) continue;

            visited[node] = true;
            totalCost += weight;

            for (Pair<Integer, Integer> neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                int neighborNode = neighbor.first;
                int edgeWeight = neighbor.second;
                if (!visited[neighborNode]) 
                {
                    minHeap.offer(new Pair<>(neighborNode, edgeWeight));
                }
            }
        }
        return totalCost;
    }
}

class Pair<F,S>{
    public F first;
    public S second;

    public Pair(F first,S second)
    {
        this.first=first;
        this.second=second;
    }
}
