package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  ArrayList <String> arr = new ArrayList<String>();
  arr.add("Black");
  arr.add("Blue");
  arr.add("Sample");
  System.out.println(arr);
  
  
  Iterator itr =  arr.iterator();
  while(itr.hasNext())
  {
	 // System.out.println();
	  System.out.println(itr.next());
	 
  }
  System.out.println();
  itr.remove();
  System.out.println(arr);
  
  
  ArrayList <String> arr1 = new ArrayList<String>();
  arr1.add("Java");
  arr1.add("C");
  arr1.add("Python");
  System.out.println(arr1);
 
  //add all
  System.out.println(arr.addAll(arr1));
  System.out.println(arr);
  
  //contains()...>to check elements of list
  System.out.println(arr.contains("Black"));
  
  //ccontailsAll(): to check whether a list is present in another list
  System.out.println(arr.containsAll(arr1));
	
	
	
	}

}
