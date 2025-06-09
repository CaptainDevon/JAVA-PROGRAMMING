import java.util.*;
public class AdjMatrixToAdjList {
    public static void main(String[] args) {
        int[][] adjMatrix = {
            {0, 1, 1, 0, 0}, 
            {1, 0, 0, 1, 1},  
            {1, 0, 0, 0, 1},  
            {0, 1, 0, 0, 1},  
            {0, 1, 1, 1, 0}   
        };

        ArrayList<ArrayList<Integer>>adjList=new ArrayList<>();
        int n=adjMatrix.length;
        while(n-->0)
        {
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<adjMatrix.length;i++)
        {
            for(int j=0;j<adjMatrix[i].length;j++)
            {
                if(adjMatrix[i][j]==1)
                {
                    adjList.get(i).add(j);
                }
            }
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
