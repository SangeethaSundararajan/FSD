package Day_6;

public class Student_Management {

	public static void main(String[] args) {
		
		    Student s = new Student();
		    
		    s.setStd_ID(101);
		    s.setStd_name("Arun");
		    s.setStd_marks(85);

		    System.out.println("Student ID: " + s.getStd_ID());
		    System.out.println("Student Name: " + s.getStd_name());
		    System.out.println("Marks: " + s.getStd_marks());

		    if (s.getStd_marks() < 0 && s.getStd_marks() > 100) {
		        System.out.println("Invalid marks");
		    }
		}

	}

class Student{
	public String getStd_name() {
	return std_name;
}
public void setStd_name(String std_name) {
	this.std_name = std_name;
}
public int getStd_ID() {
	return std_ID;
}
public void setStd_ID(int std_ID) {
	this.std_ID = std_ID;
}
public int getStd_marks() {
	return std_marks;
}
public void setStd_marks(int std_marks) {
	this.std_marks = std_marks;
}

	private String std_name;
	private int std_ID;
	private int std_marks;
	
}

class Students2 extends Student{
	
}