import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int n = inputScanner.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println( n +" X "+ i +" = "+ n*i );
        }
    }
}
