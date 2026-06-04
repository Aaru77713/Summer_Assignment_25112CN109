package Day_4;
import java.util.*;
public class Armstrong_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit of the range: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length(); // Number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == originalNum;
    }
    
}
