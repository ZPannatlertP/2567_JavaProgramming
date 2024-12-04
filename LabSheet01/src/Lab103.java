import java.util.*;

import javax.swing.JOptionPane;

import java.text.*;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");

		String strTimeparking = JOptionPane.showInputDialog("Input Time parking (minute): ");
		double timeparking = Integer.parseInt(strTimeparking);
		double productprice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit : "));
		
		double hour = timeparking / 60;
		String frmhour= String.format("%,.2f",hour);
		double min = timeparking % 60;
		String frmmin = String.format("%,.2f",min);
		
		int pricehour = hour * 50;
		int pricemin = min * 25;

		JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalpriceProduct)+" baht."
											+ "\nAdd Vat 7% is "+frm.format(totalplusVat)+" baht.");


	}

}
