import java.util.Scanner;
public class Ex_78 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input Array: ");
        int[] arr = new int[2];
        boolean tf= false;
        for(int i=0;i<arr.length;i++){
            arr[i]=inputScanner.nextInt();
            if(arr[i]==4 || arr[i]==7){
                tf=true;
            }
        }
        System.out.print("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
       System.out.println();
       System.out.println(tf);
    }
}
