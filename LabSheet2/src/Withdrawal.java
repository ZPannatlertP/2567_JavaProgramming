import javax.swing.*;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		//System.out.println(balance);
		
		int withdrawmoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance: "+balance+
											"\nInput money to withdraw:"));
		
		if(withdrawmoney > balance)
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance"
										,"ERROR"
										,JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawmoney > 50000)
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 50000"
					,"ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawmoney % 100 != 0)
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+(withdrawmoney%100)+" baht."
					,"ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"You withdraw "+withdrawmoney+" baht."
										+"\n1,000 = "+(withdrawmoney/1000)
										+"\n500 = "+((withdrawmoney%1000)/500)
										+"\n100 = "+(withdrawmoney%500)/100);
		}
	}

}
