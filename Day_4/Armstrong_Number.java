package Day_4;
import java.util.*;
public class Armstrong_Number 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
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
