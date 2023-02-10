package flipkart.com;



class Vehicle {

	void run() {
		System.out.println("Vehicle is running");

	}
}
	class Car extends Vehicle{
		
		void run() {
			
			System.out.println("Car is running");
			
			
		}
		
	}
	
	
	
	class Bike extends Vehicle{
		
		void run() {
			
			System.out.println("Bike is running");
			
			
		}
		
	



	public static void main(String args[]) {

		Bike b1 = new Bike();

		b1.run();
	}
}
