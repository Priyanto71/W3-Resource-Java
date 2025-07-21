import java.util.Scanner;
public class Ex_34 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        int s= inputScanner.nextInt();
        double area= (6 * s*s)/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is: "+area);
    }
}
