public class Ex_79 {
    public static void main(String[] args) {
        int[] arr={20, 30, 40};
        System.out.print("Original Array: ");
        for(int m:arr){
            System.out.print(m+" ");
        }
        System.out.println();
        System.out.print("Rotated Array: ");
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}
