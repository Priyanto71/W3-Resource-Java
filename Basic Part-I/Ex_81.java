public class Ex_81 {
    public static void main(String[] args) {
        int[] arr={20, 30, 40};
        System.out.print("Original Array: ");
        for(int m:arr){
            System.out.print(m+" ");
        }
        int n= arr.length;
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println();
        System.out.print("New array after swaping the first and last elements: ");
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}
