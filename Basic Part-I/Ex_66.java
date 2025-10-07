public class Ex_66 {
    public static void main(String[] args) {
        int ctr=0;
        int sum=0;
        int n=1;
        while(ctr<100){
                if(isPrime(n)){
                    sum+=n;
                    ctr++;
            }
            n++;
        }
        System.out.println("Sum of the 100 prime numbers: " + sum);
        

    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0){
            return false;
        }
    for(int i=3;i*i<=n;i+=2){
        
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}