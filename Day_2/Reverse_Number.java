package Day_2;
import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m=n;
        int rev = 0;
        while(m > 0)     
               {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        System.out.println(rev);
    }
    
}
