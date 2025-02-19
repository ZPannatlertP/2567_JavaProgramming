
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		String frmResult = String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: "+frmResult);
		System.out.printf("Area: %.2f" , rc.getArea());
		System.out.println();
		
		System.out.println();
		rc.resize(50);
		System.out.println("After resize(50%): " + rc.toString());
		String frmResult2 = String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: "+frmResult2);
		System.out.printf("Area: %.2f" , rc.getArea());

	}

}
