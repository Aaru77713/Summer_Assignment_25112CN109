package Day_7;
import java.util.Scanner;
public class Recursive_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        long factorial = calculateFactorial(num);

        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
    
}
