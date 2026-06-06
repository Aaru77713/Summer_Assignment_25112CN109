package Day_6;
import java.util.*;
public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = sc.nextLine();
        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("Decimal representation: " + decimalNumber);
        sc.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
    
}
