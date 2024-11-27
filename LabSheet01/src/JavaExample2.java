import java.text.DecimalFormat;

import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//รับมาจาก Dialog box
		DecimalFormat frm = new DecimalFormat("#,###.00");

		String strproductName = JOptionPane.showInputDialog("Input product name : ");
		String strproductunit = JOptionPane.showInputDialog("Input poduct unit : ");
		int productUnit = Integer.parseInt(strproductunit);
		double productprice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit : "));
		
		double totalpriceProduct = productUnit * productprice;
		String frmtotalprice = String.format("%,.2f",totalpriceProduct);
		double totalplusVat = totalpriceProduct + (totalpriceProduct*7/100);
		String frmtotalvat = String.format("%,.2f",totalplusVat);

		JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalpriceProduct)+" baht."
											+ "\nAdd Vat 7% is "+frm.format(totalplusVat)+" baht.");


	}

}
