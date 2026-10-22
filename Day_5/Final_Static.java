
package Day_5;

public class Final_Static {

    public static void main(String[] args) {

        // Calling static variable
        System.out.println("Version: " + Demo.ver);

        // Calling static method
        Demo.car();

        // Creating object for normal and final methods
        Demo f = new Demo();
        f.bike();
        f.accert();
    }
}

class Demo {

    // Static variable
    static String ver = "2.3.1";

    // Normal method
    public void bike() {
        System.out.println("This is a bike class");
    }

    // Final method
    public final void accert() {
        System.out.println("This property belongs to government");
    }

    // Static method
    static void car() {
        System.out.println("This is a BMW");
    }
}
