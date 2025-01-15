
public class Employee {
	//private attribute
	private String name;
	private int hourWorked;
	private double hourRate;
	
	public void setEmployeeDetails(String empName,int hours,double rate) {
		name = empName;
		hourWorked = hours;
		hourRate = rate;
		
	}

	public double calculateSalary() {
		double salary = hourWorked * hourRate;
		if(hourWorked > 40)
		{
			double bonus = salary * 0.10;
			salary += bonus;
		}
		return salary;
	}
	
	public void DisplayEMPDetails() {
		System.out.println("Name : "+name);
		System.out.println("hourWorked : "+hourWorked);
		System.out.println("hourRate : "+hourRate);
		
		System.out.println("Total salary : "+calculateSalary());
	}
	
	
}
