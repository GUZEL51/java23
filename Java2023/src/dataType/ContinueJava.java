package dataType;

public class ContinueJava {

	public static void main(String[] args) {
		/*The continue statement breaks one iteration (in the loop),
		if a specified condition occurs, 
		and continues with the next iteration in the loop.
		*/
		for (int i = 0; i < 10; i++) {
			  if (i == 3) {
			    continue;
			  }
			  System.out.println(i);
			}

	}

}
