import java.util.Scanner;
public class Ex_28 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Hexadecimal number: ");
        String hex= inputScanner.nextLine();
        int dec=Integer.parseInt(hex,16);

        System.out.println("Decimal number: "+dec);
    }
}
