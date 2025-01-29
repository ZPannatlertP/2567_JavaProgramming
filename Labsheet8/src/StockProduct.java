import java.util.*;
public class StockProduct {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product[] pid = new Product[4];
        for (int i = 0; i < pid.length; i++) {
            pid[i] = new Product();
            System.out.print("Input product Id    :");
            pid[i].setId(scan.nextLine());
            System.out.print("Input product Unit  : ");
            int proUnit = scan.nextInt();
            scan.nextLine();
            System.out.print("Input product Price : ");
            Double proPrice = scan.nextDouble();
            scan.nextLine();
            System.out.println();

        }
        Line();
        for(Product Pid : pid) {
        	System.out.println("Product ID : " + Pid.getId()+", Total price = "+Pid.calculate());
        }
        Line();
        
    }
    public static void Line() {
        for (int i = 1; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
