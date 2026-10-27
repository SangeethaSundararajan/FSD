package Day_8;

public class String_Concepts {

	public static void main(String[] args) 
	{	
		//Task1
		System.out.println("Task1");
		String a="  Sachin is a cricket player  ";  
		System.out.println(a);    
		System.out.println(a.trim());
		
		//Task2
		System.out.println("\nTask2");
		String b="Sachin";  
		 System.out.println(b.startsWith("Sa"));  
		 System.out.println(b.endsWith("N"));
		 
		 //Task3
		 System.out.println("\nTask3");
		 String c="Sachin Ten";  
		 System.out.println(c.charAt(0));
		 System.out.println(c.charAt(3)); 
		 
		 //Task4
		 System.out.println("\nTask4");
		 String d="Sachin";  
		 System.out.println(d.length());
		 
		 //Task5
		 System.out.println("\nTask5");
		 String e=new String("Sachin");  

		 String s2=e.intern();  

		 System.out.println(s2);
		 
		 //Task6
		 System.out.println("\nTask6");
		 int f=10;  
		 String g=String.valueOf(f);  
		 System.out.println(g+10);  
		 
		 //Task7
		 System.out.println("\nTask7");
		 String s1="Java is a programming language. Java is a platform. Java is an Object oriented and simple language";    
		 String replaceString=s1.replace("Java","Python");
		 System.out.println(replaceString);    
		 
		 //Task8
		 System.out.println("\nTask8");
		 String h="Sachin ";  
		   String i="Tendulkar";  
		   String j=h.concat(i);  
		   System.out.println(j);
		   
		   //Task9
		   System.out.println("\nTask9");
		   String s4="Sachin";  
		   String s5=new String("Sachin");  
		   String s6="Saurav";  
		   
		   System.out.println(s4.equals(s5));
		   System.out.println(s4.equals(s6));
		   
		   //Task10
		   System.out.println("\nTask10");
		   String s11="Sachin";  //same reference
		   String s12="Sachin";  //same reference
		   String s13=new String("Sachin");  //different reference
		   System.out.println(s11==s12);  
		   System.out.println(s11==s13);
		   
		   //Task11
		   System.out.println("\nTask11");
		   String s111="Sachin";  
		   String s211="Sachin";  
		   String s311="Ratan";  
		   System.out.println(s111.compareTo(s211));  
		   System.out.println(s111.compareTo(s311));
		   System.out.println(s311.compareTo(s111));
		   
		   //Task12
		   System.out.println("\nTask12");
		   String s1111="java by Edubridge is a very good E-Learning Platform";  
		   String replaceStrings=s1111.replaceAll("a","e");
		   System.out.println(replaceStrings);  
		   
		   //Task13
		   System.out.println("\nTask13");
		   String s18="java string split method by javatpoint";  
		   String[] words=s18.split("\\s");
		   for(String w:words){  
		   System.out.println(w);  
		   }  
		   
		   //Task14
		   System.out.println("\nTask14");
		   String s21="welcome to split world of the Java language";  
		   System.out.println("returning words:");  
		   for(String w:s21.split("\\s",0))
		   {  
		   System.out.println(w);  
		   }  
		   System.out.println("returning words:");  
		   for(String w:s21.split("\\s",1))
		   {  
		   System.out.println(w);  
		   }  
		   System.out.println("returning words:");  
		   for(String w:s21.split("\\s",2))
		   {  
		   System.out.println(w);  
		   }  
	}

}
