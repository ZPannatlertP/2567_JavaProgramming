
public class LoanCalculator {
	private String productname;
	private double priceProduct;
	private double interestRate;
	private int years;
	
	public void setProductDetails(String Name,double price,double interest,int year) {
		productname = Name;
		priceProduct = price;
		interestRate = interest;
		years = year;
	}
	
	public double calculateMonthlyPayment() {
		double MonthlyRate = (interestRate /100) /12;
		int month = years*12;
		
		double payment = (priceProduct* MonthlyRate *Math.pow(1+MonthlyRate, month)) /(Math.pow(1+MonthlyRate, month)-1) ;
		return payment;
	}
	
	public void DisplayProductDetails() {
		System.out.println("Product Name : "+name);
		System.out.println("Price <Before VAT> : "+priceProduct);
		System.out.println("Price <After VAT> : "+calculateTotalPrice());
	}
	
}
