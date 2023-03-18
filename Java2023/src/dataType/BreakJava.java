package dataType;

public class BreakJava {

	public static void main(String[] args) {
		/*break statement used in an earlier chapter of this tutorial. 
		 * It was used to "jump out" of a switch statement.
		 * The break statement can also be used to jump out of a loop.
		 */
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}

	}

}
