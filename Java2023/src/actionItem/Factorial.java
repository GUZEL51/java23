package actionItem;

public class Factorial {

	public static void main(String[] args) {
		
		
		
		dofactorial(14);
		dofactorial(19);

	}
		public static void dofactorial(int number) {
		int i=1;
		long factorial = 1;
		while(i<=number) {
			factorial *=1;
			i++;
		}
		System.out.printf("Factorial of %d=%d", number, factorial);
		
		}
}
