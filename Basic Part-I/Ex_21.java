import java.util.Scanner;
public class DecToOct {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int dec= inputScanner.nextInt();
        String oct= Integer.toOctalString(dec);
        System.out.println("Octal number: "+oct);
    }
}
