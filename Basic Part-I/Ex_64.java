import java.util.Scanner;
public class Ex_64 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = inputScanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = inputScanner.nextInt();
        if(a<25 || a>75 || b<25 || b>75){
            System.out.println("Enter numbers between 25 and 75");
        }else{
            int d1= a%10;
            int d2= a/10;
            int d3= b%10;
            int d4= b/10;
            if(d1==d3 || d1==d4 || d2==d3 || d2==d4){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
