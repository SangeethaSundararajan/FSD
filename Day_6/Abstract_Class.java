package Day_6;

public class Abstract_Class {

	public static void main(String[] args) {
		SBI s = new SBI();
		s.homeLoan();
		s.car();
		
		HondaCity h = new HondaCity();
		h.AirBags();
		
	}

}

abstract class RBI{
	private final void deposite()
	{
		System.out.println("Deposite method");
	}
	private final void withdraw(){
		System.out.println("Withdraw method");
	}
	abstract void homeLoan();
	abstract void agriLoan();
}

class SBI extends RBI
{
	public void car()
	{
		System.out.println("Loan percentage:13%");
	}
	void homeLoan(){
		System.out.println("RBI Loan percentage:19%");
	}
	void agriLoan(){
		
	}
}

interface RTO{
	void BS6();
	void DualDiscBreaks();
	void AirBags();
}

class HondaCity implements RTO
{
	
	void RootsHorn()
	{
		
	}
	void SonyMediaPlayer()
	{
		
	}

public void BS6() 
{
	System.out.println("This is interface's BS6");
}

public void DualDiscBreaks() 
{
	System.out.println("This is interface's Dual");
}

public void AirBags() 
{
	System.out.println("This is interface's AirBags");
}
}