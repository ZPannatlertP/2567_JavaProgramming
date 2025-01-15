import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product product = new Product();
		
		System.out.print("Enter Product Name :");
		String pName = scan.nextLine();
		System.out.print("Enter Product price:");
		double pPrice = scan.nextDouble();
		System.out.print("Enter Vat Rate(%) :");
		double pVat = scan.nextDouble();
		product.setProductDetails(pName, pPrice, pVat);

		System.out.println();
		product.DisplayProductDetails();
	}

}
