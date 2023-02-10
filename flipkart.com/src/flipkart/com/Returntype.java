package flipkart.com;

public class Returntype {

	String eat() {

		return "pediatric";
	}

	int dog() {

		return 10;
	}

	public static void main(String[] args) {

		// d1 is object reference //Automation is a class name
		Returntype d1 = new Returntype();
		System.out.println(d1.eat());

	}
}
