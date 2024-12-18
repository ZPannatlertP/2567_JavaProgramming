import java.util.*;
public class LabSheet404 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {		
		inputStudent();
}
	
	public static void inputStudent()
{	
		String studentID, subjectCode;
		boolean isStudentValid, isSubjectCodeValid;
		while(true) {
		System.out.print("Enter Student Id: ");
		studentID = input.nextLine();
		
		System.out.print("Enter Subject Id: ");
		subjectCode = input.nextLine();
		
		isStudentValid = isLength(studentID, 10);
		isSubjectCodeValid = isLength(subjectCode, 7);
		
		if (isStudentValid && isSubjectCodeValid)
		{
			boolean isITStudent = isITStudent (studentID);
			boolean isITSubject = isITSubject (subjectCode);		
			System.out.println("");
			System.out.println("Student ID : "+studentID+" ");
			
			displayData(isITStudent,isITSubject);

			break;
		}
	}
}
	
	public static boolean isLength(String input,int len) {		
		return input.length() == len;
	}
	
	public static boolean isITStudent(String checkId) {
		if(checkId.substring(0,6).equals("211311") ) {
			return true;
		}
		else {
			return false;
		}
	}
	
    public static boolean isITSubject(String checkSubject) {
    	if(checkSubject.substring(0,2).equals("21") && checkSubject.charAt(4) == '1') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void displayData(boolean isStu, boolean isSub) {
		if(isStu == true && isSub == true)
		{
			System.out.print("1st year student in IT\nEnroll in courses for Year 1");
		}
		if(isStu == false && isSub == true)
		{
			System.out.print("is not 1st year student in IT\nEnroll in courses for Year 1");
		}
		if(isStu == true && isSub == false)
		{
			System.out.print("1st year student in IT\nnot Enroll in courses for Year 1");
		}
		
	}
}
 
 