import java.util.Scanner;
public class Ex_22 {
    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        String bin=inputScanner.nextLine();
        int dec= Integer.parseInt(bin,2);
        System.out.println("Decimal number: "+dec);
    }
}
