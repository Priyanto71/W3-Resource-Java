public class Swap {
    public static void main(String[] args) {
        int a=27;
        int b=15;
        System.out.println("Before swapping a = "+a +", b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a = "+a+ ", b = "+b);
    }
}
