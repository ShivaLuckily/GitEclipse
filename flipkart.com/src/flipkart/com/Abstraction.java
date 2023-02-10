package flipkart.com;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

// In real scenario, method is called by programmer or user
class Abstraction {
	public static void main(String args[]) {
		Shape s;

		s = new Circle1();
		s.draw();

		s = new Rectangle();
		s.draw();

	}
}
