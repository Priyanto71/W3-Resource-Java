import java.util.Scanner;
public class Ex_37 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char [] l = inputScanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for(int i=l.length-1;i>=0;i--){
            System.out.print(l[i]);
        }
    }
}
