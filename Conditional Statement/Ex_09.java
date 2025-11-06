import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = inputScanner.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0))){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+ " is not a leap year");
        }
    }
}
