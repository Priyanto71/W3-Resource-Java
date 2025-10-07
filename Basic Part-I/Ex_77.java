public class Ex_77 {
    public static void main(String[] args) {
        int[] arr1 = {50, -20, 0};
        int[] arr2 = {5, -50, 10};
        int[] arr3 = {arr1[0], arr2[2]};
        System.out.print("Array 1: ");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
    System.out.println();
    System.out.print("Array 2: ");
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i] + " ");
    }
    System.out.println();
    System.out.print("New Array: ");
    for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i] + " ");
    }
    }
}
