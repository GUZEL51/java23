package actionItem;

public class Fahrenheit {

	public static void main(String[] args) {
		System.out.println(" Fahrenheit temp is:"
		+ convertCelcius(30.5));

	}
	public static double convertCelcius(double celcius) {
		
		double Fahrenheit = (celcius * 9/5)+ 32;
		return Fahrenheit;
		
	}
	}
