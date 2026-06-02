import java.util.*;
public class Sum_Of_Digits 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m=n;
        int sum = 0;
        while(m > 0)     
               {
            sum += m % 10;
            m /= 10;
        }
        System.out.println(sum);
    }
}