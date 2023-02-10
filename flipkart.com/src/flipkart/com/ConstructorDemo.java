package flipkart.com;

public class ConstructorDemo {

//variable is not instilizied only declared
	int xRollno;
	int id;
	String name;

	public ConstructorDemo(int xRollno, int xId, String xName) {

		this.xRollno = xRollno;
		this.id = xId;
		this.name = xName;

	}

	void display() {

		System.out.println(xRollno + " " + id + " " + name);

	}

	public static void main(String[] args) {

		ConstructorDemo sanu = new ConstructorDemo(11, 121, "Sanu Mohapatra");
		sanu.display();
		ConstructorDemo pragya = new ConstructorDemo(11, 1005, "Pragya  Mohanty");
         pragya.display();
	}

}
