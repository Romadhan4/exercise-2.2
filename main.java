
public class main {

	public static void main(String[] args) {
		Car twoSeater=new Car();
		twoSeater.printCar("Toyota", "Supra", "Red");
		twoSeater.speed(250);
		
		System.out.println();
		
		Car fourSeater=new Car();
		fourSeater.printCar("Honda", "Civic", "Silver");
		fourSeater.speed(200);
		
		System.out.println ();
		
		Car sevenSeater=new Car();
		sevenSeater.printCar("Lamborghini","URUS", "Black");
		sevenSeater.speed(305);

	}

}
