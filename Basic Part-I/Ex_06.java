import java.util.Scanner;
public class Arithmetic {
    
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = inputScanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = inputScanner.nextInt();
        System.out.println(num1+" + "+num2 +" = "+(num1+num2));
        System.out.println(num1+" - "+num2 +" = "+(num1-num2));
        System.out.println(num1+" * "+num2 +" = "+num1*num2);
        System.out.println(num1+" / "+num2 +" = "+num1/num2);
        System.out.println(num1+" mod "+num2 +" = "+num1%num2);

    }
}
