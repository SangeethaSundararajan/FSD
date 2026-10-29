package Day_9;

import java.util.LinkedList;

public class RemoveMethod {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        ll.add("Anuj");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Virat");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Amit");  
        System.out.println("Initial list of elements: "+ll);  
        
        //Removing specific element directly
        System.out.println("\n");
        ll.remove("Vijay");  
        System.out.println("After removing : "+ll);  
        
        //Removing element at specific pos  
        System.out.println("\n");
        ll.remove(0);  
        System.out.println("After removing: "+ll);  
        
        // Adding new elements to arraylist  
        System.out.println("\n");
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Ravi");  
        ll2.add("Hanumat"); 
        ll.addAll(ll2);  
        System.out.println("Updated list : "+ll);  
        
        //Removing all the new elements from arraylist
        System.out.println("\n");
        ll.removeAll(ll2);  
        System.out.println("After removing 2nd list elements: "+ll);   
        
        //Removing first element from the list  
        System.out.println("\n");
        ll.removeFirst();  
        System.out.println("After invoking removeFirst() method: "+ll); 
        
        //Removing last element from the list  
        System.out.println("\n");
        ll.removeLast();  
        System.out.println("After invoking removeLast() method: "+ll);  
        
        //Removing first occurrence of element from the list  
        System.out.println("\n");
        ll.removeFirstOccurrence("Gaurav");  
        System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
        
        //Removing last occurrence of element from the list 
        System.out.println("\n");
        ll.removeLastOccurrence("Harsh");  
        System.out.println("After invoking removeLastOccurrence() method: "+ll);  

        //Removing all the elements available in the list       
        ll.clear();  
        System.out.println("After invoking clear() method: "+ll);   
                   
	}

}
