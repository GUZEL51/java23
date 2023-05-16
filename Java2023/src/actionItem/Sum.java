package actionItem;

public class Sum {

	public static void main(String[] args) {
		
		doSum();
		
	}
		public static void doSum() {
			int start =20, end = 40, sum = 0;
			
			while (start <=end) { 
				if (start %2 ==0) {
				sum += start;
				}
				start ++;
			
		}
			System.out.println("the results is:" + sum);
	}

}
