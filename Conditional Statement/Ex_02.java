import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = inputScanner.nextDouble();
        System.out.print("Input b: ");
        double b = inputScanner.nextDouble();
        System.out.print("Input c: ");
        double c = inputScanner.nextDouble();
        double d = b*b-4*a*c;
        double x1,x2;
        if(d>0){
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are "+x1+" and "+x2);
        }else if(d==0){
            x1=(-b)/(2*a);
            x2=(-b)/(2*a);
            System.out.println("The roots are "+x1+" and "+x2);
        }else{
            System.out.println("There are no real roots");
        }
    }
}
