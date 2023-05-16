package polymorphism;

public class WebsterBank extends CentralBank {
	
	public static void main(String[]  args) {
		
		//create an object of WebsterBank Class
		CentralBank obj =new WebsterBank();
		//print the interest rate
		System.out.println("The interest rate is" + obj.homeLoanInterest());
	}
	
	/*this is overridden method 
	public double homeLoanInterest() {
		//double intRate=5.25;
		return 5.25;
		//return rate;
		 */
	
		public double carLoanIntrestRate() {
			// double intRate = 3.5;
			return 3.9;
			// return intRate;
}

}
