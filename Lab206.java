import javax.swing.*;
public class Lab206 {

    public static void main(String[] args) {
        int vanilla = 10, choccolate = 15,topping = 5;
        int price;
        String flavor;
        String flavorInput = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPress number to choose flavor:");
        int flavorSelected = Integer.parseInt(flavorInput);
        
        price = (flavorSelected== 1) ? vanilla : (flavorSelected == 2) ? choccolate : 0;
        flavor = (flavorSelected == 1) ? "vanilla" : (flavorSelected == 2) ? "chocolate" : "chocolate";
        
        while (flavorSelected !=1 && flavorSelected != 2) {
            JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!"
                    +"\nTry again...","ERROR", JOptionPane.ERROR_MESSAGE);
            flavorInput = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B." + 
                    "\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:");
                     flavorSelected = Integer.parseInt(flavorInput);
                    
                    price = (flavorSelected== 1) ? vanilla : (flavorSelected == 2) ? choccolate : 0;
                    flavor = (flavorSelected == 1) ? "vanilla" : (flavorSelected == 2) ? "chocolate" : "chocolate";
        }
        int Topping  = JOptionPane.showConfirmDialog(null, "Do you want to add topping?");
        int toppingPrice = (Topping == JOptionPane.YES_OPTION) ? topping : 0;
        int totalPrice = price + toppingPrice;
        String addTopping = (toppingPrice > 0) ? "with topping" : "no topping";
        
        JOptionPane.showMessageDialog(null,
                "You choose " + flavor +" Flavor"+
                "\nAnd " + addTopping
                + "\nTotal price = " + totalPrice + " baht.");

    }

}