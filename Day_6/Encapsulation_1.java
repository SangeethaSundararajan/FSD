
package Day_6;

public class Encapsulation_1 {

    public static void main(String[] args) {
        Phonepay p = new Phonepay();

        p.setEmail("jothi67@gmail.com");
      
        System.out.println(p.getAct_Name());
        System.out.println(p.getAct_No());
        System.out.println(p.getEmail());
        System.out.println(p.getBalance());
       
    }
}

class HTFC {
    private String Act_Name = "Sangeetha";
    private long Act_No = 123456789L;
    private String Email = "sangeetha@gmail.com";
    private long Balance = 200000;
    
   
    public String getAct_Name() {
        return Act_Name;
    }
    
    public long getAct_No() {
        return Act_No;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

 
    public long getBalance() {
        return Balance;
    }

}

class Phonepay extends HTFC {
}
