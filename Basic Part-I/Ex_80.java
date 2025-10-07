public class Ex_80 {
    public static void main(String[] args) {
        int[] arr= {20, 30, 40};
        System.out.print("Original Array: ");
        for(int m:arr){
            System.out.print(m+" ");
        }
        System.out.println();
        if(arr[0]>arr[2]){
            System.out.print("Larger value between first and last element: "+ arr[0]);
        }else if(arr[0]<arr[2]){
            System.out.print("Larger value between first and last element: "+ arr[2]);
        }else{
            System.out.println("First and last element is same");
        }
    }
}
