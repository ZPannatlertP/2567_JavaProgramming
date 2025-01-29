import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many student in class: ");
		int numofStudent = scan.nextInt();
		scan.nextLine();
		
		student[] std = new student[numofStudent];
		
		for(int i=0; i<numofStudent;i++) {
			std[i] = new student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+(i+1));
			line();
			
			System.out.print("Input Student Name: ");
			std[i].setName(scan.nextLine());
			
			System.out.print("Input student score : ");
	        int score = scan.nextInt();
	        scan.nextLine();
	        std[i].setScore(score);
	        while(!std[i].checkScore()) {
	             System.out.print("Input score, again : ");
	             std[i].setScore(scan.nextInt());        	 
	         }
	
		}
		System.out.println("LIST OF PASS STUDENT (>=50) : ");				
		line();
		for (student student : std) {
			if(student.isPass()) 
				System.out.println(">> "+student.getName()+" (" +student.getScore()+")");
		}
		scan.close();
	}
	
	public static String findGrade (int score) {
		if(score>=80) return "A";
		else if(score>=76) return "B+";
		else if(score>=70) return "B";
		else if(score>=66) return "C+";
		else if(score>=60) return "C";
		else if(score>=56) return "D+";
		else if(score>=50) return "D";
		else return "F";
	}
	
	public static void line() {
		for(int i=0;i<50;i++) {
			System.out.print("-");
		}
		System.out.println("");
	}

}
