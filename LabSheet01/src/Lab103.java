import javax.swing.*;
public class Lab103 {

	public static void main(String[] args) {

		int timeparking = Integer.parseInt(JOptionPane.showInputDialog("Input Time parking (minute): "));
		
		int hour = timeparking / 60;
		int min = timeparking % 60;
		
		double price= (hour * 50)+(min * 0.25);

		String message = String.format("Your Parking %d Hour %d Minute.\nAmount to be paid is %,.1f baht.",hour,min,price);
		JOptionPane.showMessageDialog(null, message);

	}

}
