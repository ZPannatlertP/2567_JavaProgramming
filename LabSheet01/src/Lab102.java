import java.util.*;
import java.text.*;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes : ");
		int timeMin = input.nextInt();
		
		int timeHour = timeMin / 60;
		int timeDay = timeHour / 24;
		int Day = timeDay % 365;
		int year = timeDay / 365;
		
		System.out.print(timeMin + " minutes is approximately "+year+" years and "+Day+" days");
		
		input.close();
	}

}
