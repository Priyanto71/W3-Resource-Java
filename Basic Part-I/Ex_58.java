import java.util.Scanner;
public class Ex_58 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String sentence = inputScanner.nextLine();
        String upper_case_line = "";
        
        Scanner lineScan = new Scanner(sentence);
        
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        
        System.out.println(upper_case_line.trim());
    }
}
