import java.util.*;

public class MatrixRepresentationInGraph {
    public static void main(String args[])
    {
        int V=5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 4)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4)));
        int[][]adjMatrix=new int[V][V];

        for(int i=0;i<edges.size();i++)
        {
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);

            adjMatrix[u][v]=1;
            adjMatrix[v][u]=1;
        }
        
        for(int i=0;i<adjMatrix.length;i++)
        {
            for(int j=0;j<adjMatrix[i].length;j++)
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
