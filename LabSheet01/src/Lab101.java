import java.util.*;
import java.text.*;

public class Lab101 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับทางคีบอร์ด
		Scanner input = new Scanner(System.in); //รับข้อมูลผ่านคีบอร์ด
		//กำหนด object ในการจัดรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("##,###.00");
		
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		System.out.print("Input Product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit : ");
		double productPrice = input.nextDouble();
		
		System.out.println("-------------------------------");
		
		double totalpriceProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalpriceProduct) +" baht.");
		
		System.out.println("-------------------------------");
		
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		
		System.out.println("-------------------------------");
		
		double discountPrice = totalpriceProduct * 15 /100;
		System.out.println("Discountfrom "+discount+"%"+"\t" +frm.format(discountPrice)+" baht.");
		
		double alltotal = totalpriceProduct - discountPrice;
		System.out.println("Amount to be paid \t"+frm.format(alltotal) +" baht.");
		System.out.println();

		input.close(); //close input
	}

}
