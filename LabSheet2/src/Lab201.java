import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numOfcustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalprice = BUFFET * numOfcustomer;
		
		//System.out.printf("Total Price is %,.2f baht.",totalprice);
		
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalprice)+" baht."+
					"\nDo you have a Member card?");
		}while(isMember==JOptionPane.CANCEL_OPTION); //if ismember==2
		
		if(isMember==JOptionPane.YES_OPTION) //if ismember==0
		{
			double pricewithdiscount = totalprice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(pricewithdiscount)+" baht.");
			
		}
		else if (isMember == JOptionPane.NO_OPTION) //if ismember==1
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalprice)+" baht.");
		}

			
	
	}
}
