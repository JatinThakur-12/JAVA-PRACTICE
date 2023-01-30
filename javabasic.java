import java.util.Scanner;


public class javabasic {
    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum= binNum+ (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
            
        }
        System.out.println("Binary conversion of "+mynum+" is "+binNum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int binary=sc.nextInt();
        dectobin(binary);
        sc.close();
    }
}
