import java.util.*;

public class Lab204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of X : ");
        int x = input.nextInt();
        System.out.print("Input value of Y : ");
        int y =input.nextInt();
        while (y <= x) {
            System.out.print("Input value of Y ,again : ");
         y =input.nextInt();
        }
        int sum = x;
        for(int i = x+1;i<=y;i++) {
            System.out.print(sum + " + "  + i + " = " + (sum+i));
            System.out.println();
            sum+=i;
        }
       input.close();

    }
}