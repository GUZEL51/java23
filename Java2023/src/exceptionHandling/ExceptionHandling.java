package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		System.out.println("Let us figure out exception!");
		String[] name = {"ProSmart","Java","Selenium","Eclipse"};
			
		System.out.println(name[4]);
		
		System.out.println("Possible example of another dead code");
		} catch(Exception e) {
		System.out.println("Exception Occured!" + e.getMessage());
		System.out.println("o my god!! I could hanlde one");
	}
	System.out.println("i am out of the catch block now!");
}
}









