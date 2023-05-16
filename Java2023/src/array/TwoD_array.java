package array;

public class TwoD_array {

	public static void main(String[] args) {
		

			
				
				
				int [][] my2dArray = new int [2][3];
				 
				
				my2dArray[0][0]=2;
				my2dArray[0][1]=3;
				my2dArray[0][2]=4;
				
				my2dArray[1][0]=5;
				my2dArray[1][1]=6;
				my2dArray[1][2]=7;
				System.out.println(my2dArray[1][1]);
				
				int lengthFirstArray = my2dArray.length;
				int length2ndArray = my2dArray[0].length;
				System.out.println("length of 2 d Array");
				System.out.println(lengthFirstArray);
				System.out.println(length2ndArray);
				
				System.out.println("Capturing all values from 2d Array");
				for (int i=0; i<my2dArray.length;i++)   
				{
				
					for (int j=0; j<my2dArray[0].length;j++) {
					System.out.println(my2dArray[i][j]);
					}
				}}}