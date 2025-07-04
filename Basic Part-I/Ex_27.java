import java.util.Scanner;
public class Ex_27 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Octal number: ");
        String oct= inputScanner.nextLine();
        int dec= Integer.parseInt(oct,8);
        String hex= Integer.toHexString(dec);

        System.out.println("Hexadecimal number: "+hex);
    }
}
