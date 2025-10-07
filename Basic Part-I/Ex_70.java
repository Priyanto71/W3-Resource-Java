import java.util.Scanner;
public class Ex_70 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Str1: ");
        String str1 = inputScanner.nextLine();
        int n1 = str1.length();
        System.out.print("Str2: ");
        String str2 = inputScanner.nextLine();
        int n2 = str2.length();
        if(n1==n2){
            System.out.println("Strings are same size");
        }else if(n1>n2){
            System.out.println(str2+str1+str2);
        }else{
            System.out.println(str1+str2+str1);
        }
    }
}
