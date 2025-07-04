import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= inputScanner.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println(num+" * "+ i + " = "+num*i);
        }
    }
}
