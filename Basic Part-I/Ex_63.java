import java.util.Scanner;
public class Ex_63 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a= inputScanner.nextInt();
        System.out.print("Input 2nd number: ");
        int b= inputScanner.nextInt();
        System.out.println("Result: "+result(a,b));
    }
    public static int result(int x, int y){
        if(x==y){
            return 0;
        }
        if(x%6==y%6){
            return(x<y) ? x : y;
        }
        return(x>y) ? x : y;
    }
}
