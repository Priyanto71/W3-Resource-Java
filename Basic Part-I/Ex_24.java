import java.util.Scanner;
public class Ex_24 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        String bin=inputScanner.nextLine();
        int dec=Integer.parseInt(bin,2);
        String oct=Integer.toOctalString(dec);

        System.out.println("Octal number: "+oct);
    }
}
