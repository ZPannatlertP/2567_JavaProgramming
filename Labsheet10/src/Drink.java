
public class Drink {
	public int type;
	public char size;
	
	Drink(int type , char size) {
		this.type = type;
		this.size = size;
	}
	Drink(){
		type = 0;
		size = ' ';
	}
	
	public String getTypeName() {
		if(this.gender == 'M') {
			return "Male";
		}
		else if(this.gender == 'F') {
			return "Female";
		}
		return " ";
	}
	
}
