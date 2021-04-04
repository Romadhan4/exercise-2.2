import java.util.Scanner ;

public class Car {
	
	String merk;
	String type ;
	String color;
	
	void canGo() {
		System.out.println(" car can move ");
	}
	
	void speed (int s) {
		System.out.println("Speed Max of this car"+s+"km/h");
	}
	
	void printCar(String m,String t, String c) {
		System.out.println ("Merk:"+m);
		System.out.println ("type:"+t);
		System.out.println ("color:"+c);
		canGo();
	}
		
}
