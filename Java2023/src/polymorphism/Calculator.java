package polymorphism;

public class Calculator {
	
	public void doAdd() {
		System.out.println("first add method");
	}
	
	public void doAdd(int a) {
		System.out.println("second add method");
	}
	
	public void doAdd(int a,int b) {
		int sum =a+b;
		System.out.println("addition of 2 numbers:"+ sum);
	}
	
	public void doAdd(int a,int b, int c) {
		int sum =a+b+c;
		System.out.println("addition of 3 numbers:"+ sum);
	}
	
	public void doAdd(int rc,double ab, int be) {
		double sum =rc+ab+be;
		System.out.println("addition of 3 numbers:"+ sum);
		}
}