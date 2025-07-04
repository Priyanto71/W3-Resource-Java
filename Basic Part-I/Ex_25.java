import java.util.Scanner;
public class Ex_25 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Octal number: ");
        String oct=inputScanner.nextLine();
        int dec=Integer.parseInt(oct,8);

        System.out.println("Decimal number: "+dec);
    }
}
