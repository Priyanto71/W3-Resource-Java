import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input number of terms is: ");
        int n = inputScanner.nextInt();
        System.out.println("The odd numbers are : ");
        int count=0, i=1, sum=0;
        while(count!=n){
            if(i%2!=0){
                System.out.println(i);
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println("The Sum of odd Natural Number upto "+n+" terms is: "+sum);
    }
}
