import java.util.Scanner;
public class Ex_57 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = inputScanner.nextInt();
        int i,count=0;
        for(i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
