package Day_7;
import java.util.*;
public class Recursive_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        int reversedNumber = reverseNumber(num);

        System.out.println("Reversed number of " + num + " is: " + reversedNumber);

        sc.close();
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the last digit
        }
        return reversed;
    }
    
}
