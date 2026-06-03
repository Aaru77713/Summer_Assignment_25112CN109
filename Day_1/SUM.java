package Day_1;
import java.util.*;
class SUM
{
    public static void main(String args[])
    {
        int a,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of first "+a+" numbers is: "+sum);
    }
}