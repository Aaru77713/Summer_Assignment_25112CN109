package Day_4;
import java.util.*;
public class Fibonacci_Term {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number to find in the Fibonacci series: ");
        int n = sc.nextInt();

        int result = fibonacci(n);
        System.out.println("The " + n + "th term in the Fibonacci series is: " + result);

        sc.close();
    }

    public static int fibonacci(int n) 
    {
        if (n <= 1)
             {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
