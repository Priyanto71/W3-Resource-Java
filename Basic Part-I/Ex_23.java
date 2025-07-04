import java.util.Scanner;
public class Ex_23 {
    public static void main(String[] args) {
        Scanner inputScanner= new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        String bin=inputScanner.nextLine();
        int dec=Integer.parseInt(bin,2);
        String hex=Integer.toHexString(dec).toUpperCase();
        
        System.out.println("Hexadecimal number: "+hex);
    }
}
