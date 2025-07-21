import java.util.Scanner;
public class Ex_36 {
    static final double RADIUS = 6371.01;
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = inputScanner.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = inputScanner.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = inputScanner.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = inputScanner.nextDouble();
        x1= Math.toRadians(x1);
        y1= Math.toRadians(y1);
        x2= Math.toRadians(x2);
        y2= Math.toRadians(y2);
        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between those points is: "+d+" km");
    }
}
