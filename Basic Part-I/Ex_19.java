import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int dec= inputScanner.nextInt();
        String bin="";
        while(dec!=0){
            bin=dec%2+bin;
            dec=dec/2;
        }
        System.out.println("Binary number: "+bin);
    }
}
