import java.util.Iterator;

import javax.swing.*;
public class LabSheet501_1 {
	
	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		
		boolean deptwasfound = false;
		
		String dept = JOptionPane.showInputDialog("Enter department name ");
		for(int i=0;i<deptName.length;i++)
		{
			if(dept.equalsIgnoreCase(deptName[i]));
			{
				deptwasfound = true;
			}
		}
		
		if(deptwasfound)
		{
			JOptionPane.showMessageDialog(null, dept +" was found in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, dept +" was not found in the list");
		}
	}

}
