import javax.swing.*;

public class Lab401 {

	//main
	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void inputEmail() { //ถ้ามีstatic เรียกใช้ได้เลย
		String ans;
		String varEmail;
		
		do {
			varEmail = JOptionPane.showInputDialog("Input your Email:");
			if(varEmail !=null && !varEmail.isEmpty())
			{
				checkEmailError(varEmail);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Email can't be Empty");
				
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input Email address[Y/y]:");
			
		} while(ans!=null && ans.equalsIgnoreCase("y"));
		
	}
	
	//check Emailerror
	public static void checkEmailError(String email) {
		while(email.startsWith("@") || email.contains(" "))
		{
			email = JOptionPane.showInputDialog("Invalid Email ,Input your Email , again: ");
		}

		email = email.toLowerCase();
		
		JOptionPane.showMessageDialog(null,
				checkEmail(email)
				? "Your Email is "+email //return true
				: "Your Email is not hotmail or gmail address" //return false
				);
	}
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		//มีแบบด้วย = return (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com"));
		
	}

}
