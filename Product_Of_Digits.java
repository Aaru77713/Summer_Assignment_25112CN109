import java.util.*;
public class Product_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m=n;
        int product = 1;
        while(m > 0)     
               {
            product *= m % 10;
            m /= 10;
        }
        System.out.println("Product of digits: " + product);
    }
    
}
