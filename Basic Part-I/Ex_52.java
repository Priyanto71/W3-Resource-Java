import java.util.Scanner;
public class Ex_52 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1= inputScanner.nextInt();
        System.out.print("Input the second number : ");
        int num2= inputScanner.nextInt();
        System.out.print("Input the third number : ");
        int num3= inputScanner.nextInt();
        if(num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
