import java.util.*;
public class LearningArrayList { 
  public static void main(String[] args) { 
    ArrayList<Integer> cars = new ArrayList<Integer>();
    //Inserting of the elements in the ArrayList 
    cars.add(1);
    cars.add(2);
    cars.add(3);
    //Inserting the element at the beginning ArrayList
    cars.add(0,0);
    cars.add(0,-1);						   
    System.out.println(cars);			   //Displaying the ArrayList at once	
    System.out.println(cars.get(2));       //fetching out the element 
    cars.set(2,5);                         //replaces the element at the 2nd index to 5
    System.out.println(cars);
    cars.remove(4);              // removes the element at the 4th index
    System.out.println(cars.size());
    System.out.println(cars);
    cars.clear();     //clears all the elements in ArrayList
    System.out.println(cars);
    
    cars.add(0);
    cars.add(1);
    cars.add(2);
    cars.add(3);
    cars.add(4);
    cars.add(5);
    //looping in array list
    for(int i=0;i<cars.size();i++)
    {
    	System.out.print(cars.get(i)+" ");
    }
    System.out.println();
    for(int i:cars)
    {
    	System.out.print(i+" ");
    }
    
    System.out.println();
    //passing a the list of number at once into the ArrayList
    ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	System.out.println(arr);
    
    //sorting of the list
    ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(2,3,1,0,-1,12,11));
    Collections.sort(arr1);
    System.out.println(arr1);
    
    //reversing of the list
    Collections.reverse(arr1);
    System.out.println(arr1);
  } 
}