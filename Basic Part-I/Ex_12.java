import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double a=inputScanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double b=inputScanner.nextDouble();
        System.out.print("Enter 3rd number: ");
        double c=inputScanner.nextDouble();
        System.out.println("Average= "+(a+b+c)/3);

        
    }
}
