import java.util.Scanner;
public class Ex_71 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Str1: ");
        String str1 = inputScanner.nextLine();
        System.out.print("Str2: ");
        String str2 = inputScanner.nextLine();
        System.out.println(str1.substring(1)+str2.substring(1));
    }
}
