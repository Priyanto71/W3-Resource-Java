import java.util.Scanner;
public class Ex_72 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Str1: ");
        String str1 = inputScanner.nextLine();
        int n = str1.length();
        if(n>=3){
            System.out.println(str1.substring(0,3));
        }else{
            System.out.print(str1);
            for(int i=0;i<3-n;i++){
                System.out.print("#");
            }
        }
    }
}
