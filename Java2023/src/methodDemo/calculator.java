package methodDemo;

public class calculator {

	public int doAdd(int a,int b) {
		
		int c= a+b;
		return c ;
		
		}	
		public int doSub(int a,int b) {
			int c=a-b;
			return c;	
		}
		public String concatStr(String a, String b) {
			String c = a +" " + b;//declaring and assigning value to c variable	
			return c;
		}
		public static int do3Mul(int a, int b, int c) {
			int result = a*b*c;
			return result;
		}
}
