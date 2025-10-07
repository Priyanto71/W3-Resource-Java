public class Ex_82 {
    public static void main(String[] args) {
        int[] arr={20, 30, 40, 50, 67};
        int n=arr.length;
        System.out.print("Original Array: ");
        for(int m:arr){
            System.out.print(m+" ");
        }
        System.out.println();
        if(n%2==0){
            System.out.println("Length must be odd");
        }else{
            System.out.print("Largest element between first, last, and middle values: ");
            int Largest = (arr[0]>arr[n-1]) ? ((arr[0]>arr[n/2 +1]) ? arr[0] : arr[n/2 +1] ) : ((arr[n-1]>arr[n/2 +1]) ? arr[n-1] : arr[n/2 +1] );
            System.out.print(Largest);
        }
    }
}
