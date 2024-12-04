import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number : ");
		int num1 = input.nextInt();
		while(true)
		{
			System.out.print("Input Number : ");
			int num2 = input.nextInt();
			
			if(num2< num1)
			{
				break;
			}
			num1 = num2;

		}
		System.out.print("BYE BYE");
	}

}
