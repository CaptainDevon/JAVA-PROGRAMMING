import java.util.*;

public class LearningLinkedList {
  public static void main(String[] args) {
  	//initializing of the LinkedList
    LinkedList<Integer> list=new LinkedList<Integer>();
    
    //methods used in LinkedList
    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    
    //adding at the starting of the list there are two ways
    list.addFirst(-1);  
    list.add(0,-2);
    
    //adding at the end of the list 
    list.addLast(5);
    System.out.println(list);
    
    //fetching of the elements
    System.out.println(list.get(2)); // fetches the element at index 2 which is 0
    System.out.println(list.getFirst());   //fetches the first element of the list 
    System.out.println(list.getLast());    //fetches the last element of the list
    
    //removing of the element
    list.remove(4);                //removes the element at the 4th (2)
    list.removeFirst();            //removes the first element from the list (-2)  
    list.removeLast();		   //removes the last element  from the list (5)
    System.out.println(list);

    //clearing all the elements in the list
    list.clear();
    
    //getting the size of the list
    System.out.println(list.size());
    
    //adding the list of elements in the linkedlist
    LinkedList<Integer> list1=new LinkedList<Integer>(Arrays.asList(2,-2,3,0,5,4,1));
    System.out.println(list1);
    
    //reversing of the Linked List
    Collections.reverse(list1);
    System.out.println(list1);
    
    //sorting of the LinkedList
    Collections.sort(list1);
    System.out.println(list1);
    
    //iterating through list
    //method1
    for(int i=0;i<list1.size();i++)
    {
    	System.out.print(list1.get(i));
    }
    System.out.println();
    //method2
    for(int i:list1)
    {
    	System.out.print(i);
    }
  }
}
