package flipkart.com;

public class StaticMethodDemo {

	static int i = 10;
	static int j = 20;
	
	static void display() {

		System.out.println(i);

		//show();

	}

	static void show() {

		System.out.println(i);

	}

	public static void main(String[] args) {

		StaticMethodDemo.display();
		StaticMethodDemo.show();
		
	}

}
