package Day_5;
import java.util.*;
public class Largest_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int largestPrime = -1;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                largestPrime = i;
            }
        }
        if (largestPrime != -1) {
            System.out.println("The largest prime number less than or equal to " + num + " is: " + largestPrime);
        } else {
            System.out.println("There are no prime numbers less than or equal to " + num);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
