import java.util.Scanner;
public class Ex_49 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = inputScanner.nextInt();
        System.out.println((num % 2 == 0) ? 1 : 0);
    }
}
