import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = inputScanner.nextDouble();
        System.out.println("Input value: "+num);
        if(Math.abs(num)<1 && Math.abs(num)>0){
            System.out.print("Small ");
        }else if(Math.abs(num)>1000000){
            System.out.print("Large ");
        }
        if(num>0){
            System.out.println("Positive number");
        }else if(num<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Zero");
        }
    }
}
