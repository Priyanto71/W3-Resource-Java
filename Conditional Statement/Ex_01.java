import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num= inputScanner.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }else if(num<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
