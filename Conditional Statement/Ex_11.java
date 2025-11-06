import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = inputScanner.nextInt();
        System.out.println("The first n natural numbers are: ");
        int sum=0;
        for(int m=1;m<=n;m++){
            System.out.println(m);
            sum+=m;
        }
        System.out.println("The Sum of Natural Number upto n terms : "+sum);

    }
}
