import java.util.Scanner;
public class Ex_55 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Seconds: ");
        int sec= inputScanner.nextInt();
        int hh = sec/3600;
        sec= sec-(hh*3600);
        int mm = sec/60;
        sec = sec-(mm*60);
        int ss = sec;
        System.out.println(hh+":"+mm+":"+ss);
    }
}
