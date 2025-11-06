import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Input number: ");      
    int num= inputScanner.nextInt();
    switch (num) {
        case 1-> System.out.println("Monday");
        case 2-> System.out.println("Tuesday");
        case 3-> System.out.println("Wednesday");
        case 4-> System.out.println("Thursday");
        case 5-> System.out.println("Friday");
        case 6-> System.out.println("Saturday");
        case 7-> System.out.println("Sunday");
        default->System.out.println("Wrong input");
    } 
    }
}
