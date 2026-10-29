package Day_9;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of elements: "+ll);  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        System.out.println("After inserting "+ll);  
        
        //Add element at specific pos
        System.out.println("\n");
        ll.add(1, "Gaurav");  
        System.out.println("Add element at specific position: "+ll);  
        
        //Add one list to another
        System.out.println("\n");
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");   
        ll.addAll(ll2);  
        System.out.println("After joining two list elements: "+ll);  
        
        //Adding second list elements to the first list at specific position  
        System.out.println("\n");
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
        ll.addAll(1, ll3);  
        System.out.println("Adding second list elements to the first list at specific position  : "+ll); 
        
        //Adding an element at the first position  
        System.out.println("\n");
        ll.addFirst("Lokesh");  
        System.out.println("After invoking addFirst() method: "+ll); 
	}

}
