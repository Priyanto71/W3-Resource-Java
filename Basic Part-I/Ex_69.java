import java.util.Scanner;
public class Ex_69 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String str= inputScanner.nextLine();
        int n= str.length();
        System.out.println(n);
        String result = str.substring(0,n/2);
        System.out.println(result);
    }
}
