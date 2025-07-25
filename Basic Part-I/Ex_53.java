import java.util.Scanner;
public class Ex_53 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1 = inputScanner.nextInt();
        System.out.print("Input the second number : ");
        int num2 = inputScanner.nextInt();
        System.out.print("Input the third number : ");
        int num3 = inputScanner.nextInt();
        System.out.print("Input a boolean value (true/false): ");
        boolean abc = inputScanner.nextBoolean();
        if(abc){
            if(num2<num3){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else{
            if(num1<num2 && num2<num3){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}
