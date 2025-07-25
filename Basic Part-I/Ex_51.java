import java.util.Scanner;
public class Ex_51 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str = inputScanner.nextLine();
        int num= Integer.parseInt(str);
        System.out.println("The integer value is: "+num);
    }
}
