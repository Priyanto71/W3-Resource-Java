import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {
       Scanner inputScanner = new Scanner(System.in);
       System.out.print("Input a month number: ");
       int month = inputScanner.nextInt();
       System.out.print("Input a year: ");
       int year = inputScanner.nextInt();
       String m="";
       int d=0;
       switch (month) {
        case 1-> {m="January";d=31;}
        case 2-> m="February";
        case 3-> {m="March"; d=31;}
        case 4-> {m="April"; d=30;}
        case 5-> {m="May"; d=31;}
        case 6-> {m="June"; d=30;}
        case 7-> {m="July"; d=31;}
        case 8-> {m="August"; d=31;}
        case 9-> {m="September"; d=30;}
        case 10-> {m="October"; d=31;}
        case 11-> {m="November"; d=30;}
        case 12-> {m="December"; d=31;}
       }
       if(month==2){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            d=29;
        }else{
            d=28;
        }
       }
       System.out.println(m+" "+year+" has "+ d +" days");
    }
}
