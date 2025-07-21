import java.util.Scanner;
public class Ex_33 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num= inputScanner.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}
