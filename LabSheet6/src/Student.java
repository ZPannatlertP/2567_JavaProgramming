import java.util.Iterator;

public class Student {
	private String name;
	private double[] scores;
	
	public void setStudentDetails(String stdName,double[] stdScores) {
		name = stdName;
		scores =stdScores;
	}
	public double calculateAverageScore() {
		double total = 0;
		for(int i=0;i<scores.length;i++){
			total+=scores[i];
		}
		return total/scores.length;
	}
	
	public String getGrade() {
		double average = calculateAverageScore();
		if(average>=90) {
			return "A";
		}
		else if(average>=80) {
			return "B";
		}
		else if(average>=70) {
			return "C";
		}
		else if(average>=60) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public void displayStudentDetail() {
		System.out.println("Name: " +name);
		System.out.print("Score: ");
		for(int i=0;i<scores.length;i++){
			System.out.print(scores[1]+" ");
		}
		System.out.println("\nAverage Score: "+calculateAverageScore());
		System.out.println("Grade: "+getGrade());
	}
	
}
