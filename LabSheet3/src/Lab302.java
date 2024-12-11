import javax.swing.*;

public class Lab302 {

	public static void main(String[] args)
	{
		String inputEmail = JOptionPane.showInputDialog("Input your Email: ").toLowerCase();
		
		while(inputEmail.startsWith("@") || inputEmail.contains(" "))
		{
			inputEmail = JOptionPane.showInputDialog("Input your Email , again: ");
		}

		if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com"))
		{
			JOptionPane.showMessageDialog(null,"Your Email is "+ inputEmail);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Your Email is not hotmail or gmail dot com");
		}
	}

}
