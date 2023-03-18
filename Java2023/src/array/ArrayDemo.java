package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// declaring array 
				String[] myarray=new String[3];
				//assignment value to the array 
				myarray [0]= "selenium";
				myarray[1]="Eclipse";
				myarray[2]="Java";
				
				System.out.println(myarray[1]);
				
				// another way of declaring the new array 
				int [] number = {2,3,3,4};
				for (int i=0; i<number.length; i++) {
					System.out.println(number[i]);
				
				}
				System.out.println("Example of for enhavned");
				//example of enhanced loop 
				for (int val: number) {
					System.out.println(val);
						}
				}
		}