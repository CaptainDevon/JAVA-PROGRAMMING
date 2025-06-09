import java.util.*;
public class WeightedGraph {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the vertices and the edges");
        int V=s.nextInt();
        int E=s.nextInt();
        ArrayList<ArrayList<Integer>>edges=new ArrayList<>();
        System.out.println("Enter the edges");
        //making of the edges
        while(E-->0)
        {
            int source=s.nextInt();
            int destination=s.nextInt();
            if(source<V && destination<V && source!=destination) edges.add(new ArrayList<>(Arrays.asList(source,destination)));
            else
            {
                System.out.println("out of bounds");
                E++;
            }
            s.nextLine();
        }

        System.out.println("enter the weights");

        //making of the undirected weighted graph
        Map<Integer,List<Pair<Integer,Integer>>> mpp=new HashMap<>();
        for(int i=0;i<edges.size();i++)
        {
            int source=edges.get(i).get(0);
            int destination=edges.get(i).get(1);
            int weight=s.nextInt();
            if(mpp.containsKey(source)) mpp.get(source).add(new Pair<>(destination,weight));
            else 
            {
                mpp.put(source,new ArrayList<>());
                mpp.get(source).add(new Pair<>(destination,weight));
            }

            if(mpp.containsKey(destination)) mpp.get(destination).add(new Pair<>(source,weight));
            else 
            {
                mpp.put(destination,new ArrayList<>());
                mpp.get(destination).add(new Pair<>(source,weight));
            }
        }
        System.out.println(edges);
        for (Map.Entry<Integer, List<Pair<Integer, Integer>>> entry : mpp.entrySet()) 
        {
            System.out.print(entry.getKey() + " => ");
    
            List<Pair<Integer, Integer>> pairList = entry.getValue();
    
            for (Pair<Integer, Integer> pair : pairList)
                {
                    System.out.print("(" + pair.first + ", " + pair.second + ") ");
                }

        System.out.println(); 
        }

        s.close();
    }    
}




class Pair<F,S>
{
    public F first;
    public S second;

    public Pair(F first,S second)
    {
        this.first=first;
        this.second=second;
    }
}

