import java.util.*;

public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your password(type 'exit' to quit) : ");
			String password = input.nextLine();
			
			if(password.equalsIgnoreCase("exit"))
			{
				System.out.println("Program Terminated.");
				break;
			}
			String errors = "";
			
			//check minimum lenght
			if(password.length() < 8)
			{
				errors += "-Password must be at least 8 characters long.\n";
			}
			boolean hasUp = false;
			boolean hasLow = false;
			boolean hasdigit = false;
			
			for(int i=0 ; i< password.length();i++)
			{
				char ch = password.charAt(i);
				if(ch>='A'&&ch<='Z'){
					hasUp=true;
				}
				else if(ch>='a'&&ch<='z'){
					hasLow=true;
				}
				else if(ch>='0'&&ch<='9'){
					hasdigit=true;
				}
			}
			if(!hasUp) {
				errors += "-Password must contain at lease one uppercase letter(A-Z).\n";
			}
			if(!hasLow) {
				errors += "-Password must contain at lease one lowercase letter(a-z).\n";
			}
			if(!hasdigit) {
				errors += "-Password must contain at lease one digit(0-9).\n";
			}
			
			if(errors.isEmpty())
			{
				System.out.println("Your password is Secure.");
				break;
			}
			else {
				System.out.println("Password validation errors.");
				System.out.println(errors);

			}
			
			
		}
		
		input.close();
	}

}
