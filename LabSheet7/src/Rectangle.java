
public class Rectangle {
/*	private float lenght;
	private float width;
	
	Rectangle() {
		lenght = 1.0f;
		width = 1.0f;
		
	} */

	private float lenght=1.0f;
	private float width=1.0f;
	
	Rectangle(){}
	
	Rectangle(float lenght,float width){
		this.lenght = lenght;
		this.width = width;
	}
	
	//Getter and Setter Method
	public float getlenght() {
		return this.lenght;
	}
	
	public void setlenght(float lenght) {
		this.lenght = lenght;
	}
	
	public float getwidth() {
		return this.width;
	}
	
	public void setwidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.lenght * this.width;
	}
	
	public double getParameter() {
		return 2 * (this.lenght + this.width);
	}
	
	public String showData() {
		return "Rectangle[length = " + this.lenght + ",width = " + this.width+"]";
	}
	
	public String toString() {
		return "Rectangle[length = " + this.lenght + ",width = " + this.width+"]";
	}
}
