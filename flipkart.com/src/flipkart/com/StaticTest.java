package flipkart.com;

class Test {

	static int i = 10;// static variable

	// int i = 10;//instance variable

	int j = 20;

	void display() {

		// we cannot use static in case of local varibale
		// static int x=40;
	}

}

public class StaticTest {

	public static void main(String[] args) {

		TestSanuReadonly t1 = new TestSanuReadonly();

		// By object
	

		// System.out.println(Test.i);

		// we need to create object as static varibale belongs to class label not object
		// System.out.println(Test.j);

	}
}