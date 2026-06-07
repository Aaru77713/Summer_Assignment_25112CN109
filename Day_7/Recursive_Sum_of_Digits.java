package Day_7;
import java.util.*;
public class Recursive_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find the sum of its digits: ");
        int num = sc.nextInt();

        int sumOfDigits = calculateSumOfDigits(num);

        System.out.println("Sum of digits of " + num + " is: " + sumOfDigits);

        sc.close();
    }

    public static int calculateSumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case: sum of digits of 0 is 0
        }
        return (n % 10) + calculateSumOfDigits(n / 10); // Recursive call
    }
    
}
