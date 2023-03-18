package dataType;

public class DoLoop {

	public static void main(String[] args) {
		/*
		 * a variant of the while loop
		 * do loop will execute the code block once, 
		 * before checking if the condition is true,
		 * then it will repeat the loop as long as the condition is true
		 */
		//EXAMPLE
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
	//EXAMPLE	
		 String place=("Brooklyn");
		 int start =2;
		 
		 do 
		 {
			 System.out.println("i am from" + place); 
			 start ++;	 
		 }	 
		 while (start <3);
		 
		 

	}
}

