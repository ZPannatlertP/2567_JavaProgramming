import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Fullname;
		String firstname;
		
		System.out.println("Please enter your name , seperated by a space.");
		System.out.print(":");
		Fullname = input.nextLine();
		
		int space = Fullname.indexOf(' '); //หาช่องว่าง(spacebar)
		firstname = Fullname.substring(0,space);
		//System.out.println(firstname);

		
		System.out.println(abbreviatName(Fullname));

		input.close();
	}

	public static String abbreviatName(String fname)
	{
		String initailLetter = "";
		
		for(int i=0;i<fname.length();i++)
		{
			if(fname.charAt(i)==' ')
			{
				initailLetter = (initailLetter+fname.charAt(i+1)).toUpperCase();
				
			}
			
		}//end for
		return initailLetter;
		
	}
	
	
}
