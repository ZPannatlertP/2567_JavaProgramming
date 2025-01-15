import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter Details for Employer 1 : ");
		System.out.print("Name :");
		String empName1 = scan.nextLine();
		System.out.print("Hour Worked :");
		int emphourWorked1 = scan.nextInt();
		System.out.print("Hour Rate :");
		double emphourRate1 = scan.nextDouble();
		emp1.setEmployeeDetails(empName1, emphourWorked1, emphourRate1);
		Line('-');
		System.out.println();
		emp1.DisplayEMPDetails();
		Line('*');
		System.out.println();
		
		scan.nextLine();
		
		System.out.println("Enter Details for Employer 2 : ");
		System.out.print("Name :");
		String empName2 = scan.nextLine();
		System.out.print("Hour Worked :");
		int emphourWorked2 = scan.nextInt();
		System.out.print("Hour Rate :");
		double emphourRate2 = scan.nextDouble();
		emp2.setEmployeeDetails(empName2, emphourWorked2, emphourRate2);
		Line('-');
		System.out.println();
		emp2.DisplayEMPDetails();
		Line('*');
		
		scan.close();
	}
	
	public static void Line(char symbol) {
		//System.out.println("----------------------");
		for(int i = 1;i<50;i++) {
			System.out.print(symbol);
		}
	}
	

}
