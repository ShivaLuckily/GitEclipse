package flipkart.com;

class Start {

	static int add(int a,long b) {
		return a + b;
	}

	static double add(long a,int b) {
		return a + b;
	}
}

public class AdderMethodOverloading {
	public static void main(String[] args) {
		System.out.println(Start.add(11, 11));
		//System.out.println(Start.add(11.1f, 11.4f));

	}
}