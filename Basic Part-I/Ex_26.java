import java.util.Scanner;
public class Ex_26 {
    public static void main(String[] args) {
        Scanner inputScanner= new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String oct= inputScanner.nextLine();
        int dec= Integer.parseInt(oct,8);
        String bin= Integer.toBinaryString(dec);

        System.out.println("Binary number: "+bin);
    }  
}
