package flipkart.com;

class Animal {

   private int age = 20;

   void eat() {

	System.out.println("Sanu lives in Jajpur");
	}

}


public class Dog extends Animal {

	public static void main(String[] args) {

		//d1 is object reference //Automation is a class name
		Dog d1 = new Dog();
	
		d1.eat();
		
		

	}
}
