import javax.swing.JOptionPane;

public class Lab302_1 {

	public static void main(String[] args)
	{
		String inputEmail;
		
		boolean checkEmail = false;
		
		while(true)
		{
			inputEmail = JOptionPane.showInputDialog("Input your Email: ").toLowerCase();
			while(inputEmail.startsWith("@") || inputEmail.contains(" "))
			{
				inputEmail = JOptionPane.showInputDialog("Input your Email , again: ");
			}

			checkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com");
		
			if(checkEmail) //
			{
				JOptionPane.showMessageDialog(null,"Your Email is "+ inputEmail);
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Your Email is not hotmail or gmail dot com");
				continue;
			}
			
		}
	}

}
