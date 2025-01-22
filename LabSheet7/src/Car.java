
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car(){ //Default Constructor
		/*companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0; */
		this("Unknown","Unknown",2000,0.0);
	}
	
	Car(String companyName ,String modelName,int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		this.year = year<1886? 2000 :year;
		this.mileage = mileage;
	}
	
	public void setcompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}
		else {
			System.out.println("ERROR: Invalid company name");
		}
	}
	
	public void setmodelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}
		else {
			System.out.println("ERROR: Invalid model");
		}
	}
	
	public void setYear(int year) {
		if(year >=
				1886) {
			this.year = year;
		}
		else {
			System.out.println("ERROR: Invalid year");
		}
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public int getyear() {
		return year;
	}
	public double getmileage() {
		return mileage;
	}
	
	public String showData() {
		return "Company Name : " + this.companyName+ "\nModel Name : " + this.modelName+"\nYear : "+this.year;
	}
}
