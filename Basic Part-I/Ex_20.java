import java.util.Scanner;
public class DecToHex {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Decimal number: ");
        int dec= inputScanner.nextInt();
        String hex= Integer.toHexString(dec).toUpperCase();
        
        System.out.println("Hexadecimal number: "+hex);
    }
}
