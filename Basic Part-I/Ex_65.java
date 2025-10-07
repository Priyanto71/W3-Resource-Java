import java.util.Scanner;
public class Ex_65 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = inputScanner.nextInt();
        System.out.print("Input 2nd number: ");
        int b = inputScanner.nextInt();
        int d = a/b;
        int r = a- (d*b);
        System.out.println(r);
    }
}
