package Day_6;
import java.util.Scanner;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            count += (n & 1); // Check the last bit
            n >>= 1;          // Right shift by 1
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Number of set bits = " + countSetBits(num));
        
        sc.close();
    }
}