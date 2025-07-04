import java.util.Scanner;
public class BinAdd {
    public static void main(String[] args) {
       Scanner inputScanner = new Scanner(System.in);
    System.out.print("Enter 1st Binary number: ");
        String bin1= inputScanner.nextLine();
        int dec1=Integer.parseInt(bin1,2);
        System.out.print("Enter 2nd Binary number: ");
        String bin2= inputScanner.nextLine();
        int dec2=Integer.parseInt(bin2,2);
        int sum=dec1+dec2;
        String bin3=Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: "+bin3);
    }
    
}
