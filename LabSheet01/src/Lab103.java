import java.util.*;

import javax.swing.JOptionPane;

import java.text.*;
import java.text.DecimalFormat;
import java.text.DecimalFormat;
public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");

		int timeparking = Integer.parseInt(JOptionPane.showInputDialog("Input Time parking (minute): "));
		
		int hour = timeparking / 60;
		int min = timeparking % 60;

		
		double price= (hour * 50)+(min * 0.25);

		String message = String.format("Your Parking %d Hour "" Minute."
											+ "\nAmount to be paid is "" baht.");


	}

}
