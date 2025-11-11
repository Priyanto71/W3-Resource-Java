import java.util.Scanner;

public class Ex_26 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = inputScanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(char ch = 'A'; ch<'A'+i;ch++){
                System.out.print(ch);
            }
            for(char ch=(char)('A'+i-2);ch>='A';ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            for(char ch=(char)('A'+i-2);ch>='A';ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
