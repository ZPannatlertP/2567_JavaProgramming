
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("display data using tostring() method");
		System.out.println(r1);
		Spacing();
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		Spacing();
		
		r1.setlenght(5.6f);
		r1.setwidth(7.8f);
		System.out.println(r1);
		System.out.println("Length is "+ r1.getlenght());
		System.out.println("Width is "+ r1.getwidth());
		
		//test get area & parameter
		Spacing();
		System.out.printf("Area is %.2f%n", r1.getArea());
		System.out.printf("Perimeter is %.2f", r1.getParameter());
		
		Spacing();
		System.out.printf("Area is %.2f%n", r2.getArea());
		System.out.printf("Perimeter is %.2f", r2.getParameter());
		
	}

	public static void Spacing() {
		System.out.println();
	}
	
}
