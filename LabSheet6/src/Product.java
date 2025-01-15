
public class Product {
	private String name;
	private double priceProduct;
	private double vatRate;
	
	public void setProductDetails(String productName,double price,double vat) {
		name = productName;
		priceProduct = price;
		vatRate = vat;
	}
	
	public double calculateTotalPrice() {
		double afterVat = priceProduct+(priceProduct * vatRate /100);
		return afterVat;
	}
	
	public void DisplayProductDetails() {
		System.out.println("Product Name : "+name);
		System.out.println("Price <Before VAT> : "+priceProduct);
		System.out.println("Price <After VAT> : "+calculateTotalPrice());
	}
	
}
