package Day_9;

public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			long data=100/10;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}

}
