package Day_8;

public class Builder_Buffer {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Face");  
        for (int i=0; i<10000000; i++){  
            sb.append("prep");  
        }  
        
        System.out.println("Time taken by StringBuffer: " +
        (System.currentTimeMillis() - startTime) + "ms");  
        
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Face");  
        for (int i=0; i<10000000; i++){  
            sb2.append("prep");  
        }  
        System.out.println("Time taken by StringBuilder: " + 
        (System.currentTimeMillis() - startTime) + "ms"); 
        
        //Append
        System.out.println("\nStringBuffer Append method");
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" Java");
        System.out.println(sb1);
        
        System.out.println("\nStringBuilder Append method");
        StringBuilder sb3 = new StringBuilder("Good");
        sb3.append(" Morning");
        System.out.println(sb3);
        
        //Insert
        System.out.println("\nStringBuffer Insert method");
        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.insert(1, "Java");
        System.out.println(sb4);
        
        
        System.out.println("\nStringBuilder Insert method");
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.insert(2, "Java");
        System.out.println(sb5);
        
        //Replace
        System.out.println("\nStringBuffer Replace method");
        StringBuffer sb6 = new StringBuffer("Hello");
        sb6.replace(1, 3, "Java");
        System.out.println(sb6);
        
        System.out.println("\nStringBuilder Replace method");
        StringBuilder sb7 = new StringBuilder("Hello");
        sb7.replace(1, 4, "i");
        System.out.println(sb7);
        
        //Delete
        System.out.println("\nStringBuffer Delete method");
        StringBuffer sb9 = new StringBuffer("Hello");
        sb9.delete(1, 3);
        System.out.println(sb9);
        
        System.out.println("\nStringBuilder Delete method");
        StringBuilder sb8 = new StringBuilder("Welcome");
        sb8.delete(1, 4);
        System.out.println(sb8);
        
        //Reverse
        System.out.println("\nStringBuffer Reverse method");
        StringBuffer sb10 = new StringBuffer("Hello");
        sb10.reverse();
        System.out.println(sb10);
        
        System.out.println("\nStringBuilder Reverse method");
        StringBuilder sb11 = new StringBuilder("Java");
        sb11.reverse();
        System.out.println(sb11);
	}

}
