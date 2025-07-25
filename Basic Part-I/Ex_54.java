import java.util.Scanner;
public class Ex_54 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1 = inputScanner.nextInt();
        System.out.print("Input the second number : ");
        int num2 = inputScanner.nextInt();
        System.out.print("Input the third number : ");
        int num3 = inputScanner.nextInt();
        if(num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num1 % 10 == num3 % 10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
