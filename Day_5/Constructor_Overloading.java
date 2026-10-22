package Day_5;

public class Constructor_Overloading {

	public static void main(String[] args) {
		Son s1 = new Son();
		Son s2 = new Son(10);
		
		s1.d1();
		s1.d2();

	}
}
	class Father{
		public void d1(){
			System.out.println("Parent method");
		}
		Father()
		{
			System.out.println("Default constructor");
		}
		Father(String name)
		{
			System.out.println("Para constructor");
		}
	}
	class Son extends Father{
		public void d2(){
			System.out.println("Child method");
		}
		Son()
		{
			super();
			System.out.println("Sons default cons");
		}
		Son(int a)
		{
			super();
			System.out.println("Sons para cons");
		}
	}


