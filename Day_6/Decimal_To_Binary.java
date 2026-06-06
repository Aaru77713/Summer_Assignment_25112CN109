package Day_6;
import java.util.*;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);
        sc.close();
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }
    
}
