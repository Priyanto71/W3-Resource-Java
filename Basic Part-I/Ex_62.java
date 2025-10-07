import java.util.Scanner;
public class Ex_62 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a=inputScanner.nextInt();
        System.out.print("Input 2nd number: ");
        int b=inputScanner.nextInt();
        System.out.print("Input 3rd number: ");
        int c=inputScanner.nextInt();

        System.out.println(Math.abs(a-b)>=20 || Math.abs(b-c)>=20 || Math.abs(a-c)>=20);
    }
}
