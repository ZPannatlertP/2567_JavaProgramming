
public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setStudentDetails("Zen", new double[] {85.0,78.0,92.0});
		student2.setStudentDetails("Gi", new double[] {68.0,66.5});
		
		System.out.println("Student 1 details: ");
		student1.displayStudentDetail();
		System.out.println("\nStudent 2 details: ");
		student2.displayStudentDetail();
	}
	
}
