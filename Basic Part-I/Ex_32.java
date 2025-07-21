import java.util.Scanner;
public class Ex_32 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
      System.out.print("Input first integer: ");  
      int a=inputScanner.nextInt();
      System.out.print("Input second integer: ");
      int b=inputScanner.nextInt();
      if(a!=b){
       System.out.println(a+" != "+b);
      }else if(a==b){
        System.out.println(a+" == "+b);
      }
      if(a>b){
        System.out.println(a+" > "+b);
      }else if(a<b){
        System.out.println(a+" < "+b);
        
      }
      if(a>=b){
        System.out.println(a+" >= "+b);
      }else if(a<=b){
        System.out.println(a+" <= "+b);
      }

    }
}
