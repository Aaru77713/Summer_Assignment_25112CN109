import java.util.*;
public class Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its Fibonacci: ");
        int num = sc.nextInt();

        long fibonacci = calculateFibonacci(num);

        System.out.println("Fibonacci of " + num + " is: " + fibonacci);

        sc.close();
    }

    public static long calculateFibonacci(int n) {
        if (n == 0) {
            return 0; // Fibonacci of 0 is 0
        } else if (n == 1) {
            return 1; // Fibonacci of 1 is 1
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // Recursive call
    }
    
}
