package variables;

public class NestedLoop2 {

	public static void main(String[] args) {
		/* create nested loop
		 * while loop
		 * for loop
		 * do while loop
		 * it would repeat for 60 times 
		 * 
		 */
		int i = 0;
		int count =0;
		
		while (i<3) {
			for (int j = 0; j<4; j++) {
				int k = 0;
				do {
					System.out.println("i-> "+i+ "j->");
					k++;
					count++;
			} while (k<5);
		}
			i++;
	}
			System.out.println("the iteration count is : " + count);
				

	}
}