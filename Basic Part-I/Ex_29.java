import java.util.Scanner;
public class Ex_29 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Hexadecimal number: ");
        String hex= inputScanner.nextLine();
        int dec=Integer.parseInt(hex,16);
        String bin= Integer.toBinaryString(dec);

        System.out.println("Binary number: "+bin);
    }
}
