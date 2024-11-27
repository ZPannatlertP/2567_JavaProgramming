import java.util.*;
import java.text.*;

public class JavaExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับทางคีบอร์ด
		Scanner input = new Scanner(System.in); //รับข้อมูลผ่านคีบอร์ด
		//กำหนด object ในการจัดรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		System.out.print("Input Product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println();
		
		float totalpriceProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalpriceProduct) +" baht.");
		
		float totalplusVat = totalpriceProduct + (totalpriceProduct*7/100);
		System.out.println("Add Vat 7% is "+frm.format(totalplusVat) +" baht.");
		System.out.println();
		
		String frmtotalvat = String.format("%,.2f",totalplusVat);
		System.out.println("Output using String.format");
		System.out.println("Add Vat 7%% is "+frmtotalvat +" baht.");
		
		System.out.println("Output using printf");
		System.out.printf("Add Vat 7% is %,.2f",totalplusVat);
		
		input.close(); //close input
	}

}
