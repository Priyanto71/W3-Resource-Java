import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = inputScanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
