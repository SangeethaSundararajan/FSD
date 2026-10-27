package Day_6;

public class Online_Food_Delivery {

	public static void main(String[] args) {
		PizzaRestaurant p = new PizzaRestaurant();
		BurgerRestaurant b = new BurgerRestaurant();
		
		p.displayMenu();
		p.calculateBill();
		b.displayMenu();
		b.calculateBill();

	}

}

abstract class Restaurant
{
	abstract void displayMenu();
	abstract void calculateBill();
}

class PizzaRestaurant extends Restaurant
{
      void displayMenu(){
		System.out.println("Briyani : Rs:150");
	}
      void calculateBill(){
    	  int prize = 150;
  		System.out.println("Bill Amt : " +prize);
  	}
}

class BurgerRestaurant extends Restaurant
{
	void displayMenu(){
		System.out.println("Cheese pizza : Rs:450");
	}
	void calculateBill(){
		int prize = 450;
		System.out.println("Bill Amt : " +prize);
	}
}