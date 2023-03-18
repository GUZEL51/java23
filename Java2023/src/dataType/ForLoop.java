package dataType;

public class ForLoop {

	public static void main(String[] args) {
		/*for (initialization/start point, how far/end point, how much it can increase or decrease)
		 * {
		 * code
		 * }
		 	*/  
		
		/*
		 * When you know exactly how many times 
		 * you want to loop through a block of code,
		 * use the for loop instead of a while loop:
		 * Statement 1 is executed (one time) before the execution of the code block.
		 * Statement 2 defines the condition for executing the code block.
		 * Statement 3 is executed (every time) after the code block has been executed.
		 */
		//EXAMPLE
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
		//write $ ten times ;)
				 System.out.println("starts");
				 for (int d = 0; d < 5; d++) {
					  System.out.println("$");
				 }
				 System.out.println("ends"); 
		}
	}
}
