import java.util.Scanner;
public class Ex_60 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = inputScanner.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: "+words[words.length-2]);
    }
}
