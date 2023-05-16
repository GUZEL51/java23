package inheritance;

public class Huskey  extends Dog {

	private static Huskey obj;

	public static void main(String[] args) {
	Huskey.obj =new Huskey();
	obj.sound();
	}
		
	public void sound() {
	 	System.out.println("woof");
		

	}

}
