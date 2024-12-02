import java.util.*;
public class LearningHashMap { 
  public static void main(String[] args) {
  	//initializing of the hash map
  	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    //methods used in HashMap
    map.put(1,5);          //(key,value)
    map.put(2,3);
    map.put(3,1);
    System.out.println(map);
    
    //fetching out the items
    System.out.println(map.get(1)); //gives the value at the keyValue=1
    
    //fetching the keys in the hashmap
    for(int i:map.keySet())
    {
    	System.out.print(i+" ");
    }
    System.out.println();
    
    //fetching values in the hashmap
    for(int i:map.keySet())
    {
    	System.out.print(map.get(i)+" ");
    }
    System.out.println();
    
    
    for(int i:map.values())
    {
    	System.out.print(i+" ");
    }
    System.out.println();
    //removing of the elements in the hash map
    map.remove(2);
    System.out.println(map);
    
    //clearing the hashmap
    map.clear();
    System.out.println(map);
    
    //size of the map
    System.out.println(map.size());
    
    //initializing the hashmap and setting all its value to false
    HashMap<Integer,Boolean> boolMap=new HashMap<Integer,Boolean>();
    int indexes[]={1,2,3,4,5,6};
    for(int it:indexes)
    {
    	boolMap.put(it,true);
    }
    System.out.println(boolMap);
    
    //given arraylist we have to count the frequencies
    ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,3,1,0,2,4,1,4));
    HashMap<Integer,Integer> frequencyMap=new HashMap<Integer,Integer>();
    for(int i=0;i<arr.size();i++)
    {
    	if(frequencyMap.containsKey(arr.get(i)))
        {
        	frequencyMap.put(arr.get(i),frequencyMap.get(arr.get(i))+1);
        }
        else
        {
        	frequencyMap.put(arr.get(i),1);
        }
    }
    
    System.out.println(frequencyMap);

  } 
}