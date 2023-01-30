import java.util.*;
public class leap_year{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE YEAR TO CHECK IT IS A LEAP YEAR OR NOT:");
        int year=sc.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = (year%400)==0 && (year%100)==0;
        if(x&&(y||z)){
            System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year+ " is not a Leap Year.");
        }
        sc.close();

    }
}