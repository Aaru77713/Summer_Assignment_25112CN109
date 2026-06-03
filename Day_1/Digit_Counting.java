package Day_1;
import java.util.*;
public class Digit_Counting 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int count = 0;
        while (number > 0) 
        {
            number /= 10; // Remove the last digit
            count++; // Increment the count of digits
        }
        System.out.println("Number of digits: " + count);
    }
}