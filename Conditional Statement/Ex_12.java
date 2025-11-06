import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the 5 numbers : ");
        int[] arr = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i] = inputScanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of 5 no is : "+sum);
        double avg = (double)sum/5;
        System.out.println("The Average is : "+avg);
    }
}
