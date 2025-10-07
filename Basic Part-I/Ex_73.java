import java.util.Scanner;
public class Ex_73 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Str1: ");
        String str1 = inputScanner.nextLine();
        int n1=str1.length();
        System.out.print("Str2: ");
        String str2 = inputScanner.nextLine();
        int n2=str2.length();
        if(n1!=0 && n2!=0){
            System.out.println(""+str1.charAt(0)+str2.charAt(n2-1));
        }else if(n1==0 && n2==0){
            System.out.println("##");
        }else if(n1!=0 && n2==0){
            System.out.println(""+str1.charAt(0)+"#");
        }else{
            System.out.println("#"+str2.charAt(n2-1));
        }
    }
}
