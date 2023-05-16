package inheritance;

public class Cat extends Animal {
	

	public static void main(String[] args) {
	
		Cat obj =new Cat();
		obj.sound();
	}
	public void sound() {
		System.out.println("meow");
	}
}
