import java.util.Scanner;

public class Ex_24 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = inputScanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
