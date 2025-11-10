import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int count = 1;
        int n = inputScanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
            
        }
    }
}
