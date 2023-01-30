public class Factorial_Recursion {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fac= n*fnm1;
        return fac;

    }
    public static void main(String args[]){
        int n=0;
        System.out.println(fact(n));
    }
}
