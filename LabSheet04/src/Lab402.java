import javax.swing.*;
public class Lab402 {
 
public static void main(String[] args)
{
	int year = Integer.parseInt(JOptionPane.showInputDialog(null,"Input year: "));
	
	while (checkYear(year)==false)
	{
		year = Integer.parseInt(JOptionPane.showInputDialog(null,"Input year: "));
	}
	
	if(isLeapYear(year)==true) {
		JOptionPane.showMessageDialog(null,year+ "is Leap year.");
	}
	else {
		JOptionPane.showMessageDialog(null,year+ "is NOT Leap year.");
	}
 
}//end of main

public  static boolean isLeapYear (int _year) {
	if(_year%4==0 && _year%100!=0 || _year%400==0) {
		return true;
	}
	else {
		return false;
	}
}

public static boolean checkYear(int _year) {
	if (_year<=3000&&_year>=1000) {
		return true;
	}
	else {
		return false;
	}
}
 
}