import java.util.Scanner;
public class Ex_38 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input :  ");
        char [] s = inputScanner.nextLine().toCharArray();
        int letter=0,space=0,number=0,other=0;
        System.out.print("The string is :  ");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
            if(Character.isSpaceChar(s[i])){
                space++;
            }else if(Character.isDigit(s[i])){
                number++;
            }else if(Character.isLetter(s[i])){
                letter++;
            }else{
                other++;
            }
        }
        System.out.println("\nletter: "+letter);
        System.out.println("space: "+space);
        System.out.println("number: "+number);
        System.out.println("other: "+other);

    }
}
