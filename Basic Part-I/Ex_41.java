import java.util.Scanner;
public class Ex_41 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Character: ");
        char ch=inputScanner.next().charAt(0);
        int value=ch;
        System.out.printf("The ASCII value of %c is :%d",ch,value);

    }
}
