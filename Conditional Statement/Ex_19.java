import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int n = inputScanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
