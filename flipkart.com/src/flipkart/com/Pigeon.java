package flipkart.com;

//Multilevel inherentance
//Parent class
class Bird {

	void eat() {

		System.out.println("eating");
	}

	void sleeping() {

		System.out.println("sleeping");
	}

}
//Child class
class Owl extends Bird {

	void dancing() {

		System.out.println("dancing");
	}
}

//Child class
public class Pigeon extends Owl {

	public static void main(String[] args) {

		Pigeon p1 = new Pigeon();
		p1.eat();
		p1.sleeping();
		p1.dancing();

	}

}