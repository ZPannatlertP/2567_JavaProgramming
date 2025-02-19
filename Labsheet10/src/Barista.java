
public class Barista {
	public String name;
	public char gender;
	
	Barista(String name , char gender) {
		this.name = name;
		this.gender = gender;
	}
	Barista(){
		name = " ";
		gender = ' ';
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGenderName() {
		if(this.gender == 'M') {
			return "Male";
		}
		else if(this.gender == 'F') {
			return "Female";
		}
		return " ";
	}
}
