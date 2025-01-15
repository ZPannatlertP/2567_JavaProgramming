
public class Test_Employee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmployeeDetails("Zen", 45, 20.0);
		emp2.setEmployeeDetails("ehe", 38, 25.0);
	
		System.out.println("Employee 1 Details");
		emp1.DisplayEMPDetails();
		
		System.out.println("\nEmployee 2 Details");
		emp2.DisplayEMPDetails();
	}

}
