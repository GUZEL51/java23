package inheritance;

public class Test implements InterFaceDemo{

	public static void main(String[] args) {
		
		Test object= new Test();
		object.makeSound();
		
		ConstructorDemo obj1= new ConstructorDemo("MAsud", 1);		
			System.out.println(obj1.getName());
	}

	@Override
	public void makeSound() {
		
		System.out.println("please sing my favorite song");
	}

}
