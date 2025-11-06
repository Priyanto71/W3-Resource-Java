import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = inputScanner.nextInt();
        System.out.print("Input 2nd number: ");
        int b = inputScanner.nextInt();
        System.out.print("Input 3rd number: ");
        int c = inputScanner.nextInt();
        if(a>b && b>c){
            System.out.println("The greatest: "+a);
        }else if(b>a && a>c){
            System.out.println("The greatest: "+b);
        }else{
            System.out.println("The greatest: "+c);
        }
    
}
}