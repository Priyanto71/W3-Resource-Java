public class Ex_39 {
   public static void main(String[] args) {
    int i,j,k,count=0;
    for(i=1;i<=4;i++){
        for(j=1;j<=4;j++){
            for(k=1;k<=4;k++){
                if(i != j && j != k && i != k){
                    count++;
                    System.out.println(i+""+j+""+k);
                }
            }
        }
    }
    System.out.println("Total number of the three-digit-number is: "+count);
   } 
}
