import java.util.Scanner;
public class Ex_61 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String str = inputScanner.nextLine();
        System.out.print("Reverse word: ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
