package flipkart.com;

class AnimalType {

	/*
	 * void eat(String food,String color) {
	 * 
	 * 
	 * System.out.println("Foods" +food+ "colour" +color); }
	 * 
	 * void eat(String food,String color,String name) {
	 * 
	 * System.out.println("Foods" +food+ "colour" +color +"Name"+name); }
	 */

	static int eat(int age, String color) {

		return age + color;
	}
	static String eat(int age, String color) {

		return "age is" + age + "color is" +color;
	}

}

public class MethodOverloading {

	public static void main(String[] args) {

		AnimalType a = new AnimalType();
		/*
		 * a.eat("Grain", "Black");
		 * 
		 * a.eat("meat", "white","Tiger");
		 */
		
		//System.out.println(a.eat(10,2012));
		//System.out.println(a.eat(10, "white","Tiger"));
	}
}
