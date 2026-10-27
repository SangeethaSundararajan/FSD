package Day_8;

import java.util.Scanner;
public class Task {

	public static void main(String[] args) 
	{
		
		//Task1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		int len = name.length();
		boolean Space = name.contains(" ");
		
		System.out.println("Username:" +name);
		System.out.println("Length:" + len);
		
		if(Space)
		{
			System.out.println("Contain space:Yes");
		}
		else
		{
			System.out.println("Contain space:No");
		}
		
		if(len>=5 && !Space)
		{
			System.out.println("Valid name");
		}
		else
		{
			System.out.println("Invalid name");
		}
		
		
		//Task2
		System.out.println("\n");
		Scanner scc = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = scc.nextLine();

        int atPosition = email.indexOf("@");

        String username = email.substring(0, atPosition);
        String domain = email.substring(atPosition + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
	}

}
