
public class DemoCar {
	public static void main(String[] args) {
	Car car1 = new Car("Chevrolet","Cruze",2009,150000.0);
	System.out.println(car1.showData());
	System.out.println("Mileage:"+car1.getmileage());
	
	System.out.println("\nUpdate Car Details: ");
	Car car2 = new Car("Tfef","oplf",1887,0);
	System.out.println(car2.showData());
	
	car2.setYear(0);
	car2.setcompanyName(null);
	}
}
