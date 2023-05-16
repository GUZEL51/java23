package methodDemo;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		
		/*
	}
		//created an object of Calculator class
		calculator calc=new calculator();
		
		System.out.println("Addition of a and b is:" +calc.doAdd(67,12));
		
		System.out.println("Value of a -b is:" +calc.doSub(15,12));
		
		System.out.println(+calc.doAdd(611,12));
		
		System.out.println(+calc.doSub(611,12));
		
		System.out.println(calc.concatStr("Hello,",
				"I am learning"));
		calc.concatStr("hello","I am learning");
	}
		
		/*public int doMul(int a, int b) {
		int c =a *b;
		*/
	
	calculator calc=new calculator();
	System.out.println( calc.doAdd(23,45));
	System.out.println( calc.doSub(23,45));
	
	System.out.println( calc.concatStr("hello","I am learning Java!!"));
	
	TestCalculator obj =new TestCalculator();
	System.out.println( obj.doMul(54,95));
	System.out.println( doDiv(34,7));
	System.out.println(calculator.do3Mul(4, 722, 67));
	}
		
	public void dogSound() {
		sound();
	System.out.println("I CAN HEAR DOG BAEKIBG");
	}
	
	
	public int doMul(int a,int b) {
		int c =a*b;
		System.out.println( "I am multiplying");
		return c;
	}
	
	public static double doDiv(int a,int b) {
		double c =a/b;
		return c;
	}
	
	public void sound() {
		System.out.println("Make some generic sound");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

