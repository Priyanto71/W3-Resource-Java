import java.util.Scanner;
public class Ex_35 {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Input the number of sides on the polygon: ");
    int n = inputScanner.nextInt();
    System.out.print("Input the length of one of the sides: ");
    int s = inputScanner.nextInt();
    double area = (n*s*s)/(4*Math.tan(Math.PI/n));
    System.out.println("The area is: "+area);
    }
    
}
