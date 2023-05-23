Package polymorphism;

public class ChaseBank extends CentralBank  {
	
	
	public static void main (String[] args) {
		///WebDriver driver = new ChromeDriver();
		//ChromeDriver driver =  new WebDriver();// wrong
		
		ChaseBank obj = new ChaseBank();
		System.out.println("The intrest rate is:" + obj.homeLoanInterest());
	}
	public double homeLoanInterest() {
		//double intRate=3.5;
		return 4.5;
		//return rate;
		
	}
}

