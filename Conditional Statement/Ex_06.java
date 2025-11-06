import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.err.print("Input floating-point number: ");
        double num1 = inputScanner.nextDouble();
        System.out.print("Input floating-point another number: ");
        double num2= inputScanner.nextDouble();
        num1=Math.round(num1 * 1000);
        num2 = Math.round(num2 * 1000);
        num1 = num1/1000;
        num2 = num2/1000;
        if(num1 == num2){
            System.out.println("They are same");
        }else{
            System.out.println("They are different");
        }
    }
}
