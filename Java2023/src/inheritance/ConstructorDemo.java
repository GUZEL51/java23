package inheritance;

public class ConstructorDemo {

	
		String name;
		int rollno;
		public String getName() {
			return name;
		}
	/*	public void setName(String name) {
			this.rollno = rollNo;
			}
	*/
		public void setNo(int rollNo) {
	//		return rollNo;

	}
		public void setRollNo(int rollNo) {
			this.rollno = rollNo;
}
		// example of constructor
	public ConstructorDemo(String name, int rollNo) {
		//System.out.println("I am default constructor!!");
		this.name= name;
		this.rollno=rollNo;
		System.out.println("called");
	}
}