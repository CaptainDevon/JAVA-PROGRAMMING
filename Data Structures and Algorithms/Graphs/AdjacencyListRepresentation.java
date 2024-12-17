import java.util.*;
public class AdjacencyListRepresentation {
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 4)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4)));

        ArrayList<ArrayList<Integer>>adjList=new ArrayList<>();
        while(V-->0)
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

        for(int i=0;i<adjList.size();i++)
        {
            System.out.print(i+" -> ");
            for(int j=0;j<adjList.get(i).size();j++)
            {
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }    
}
