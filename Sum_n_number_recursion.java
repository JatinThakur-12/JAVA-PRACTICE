public class Sum_n_number_recursion {
    public static int calsum(int n) {
        int sum;
        if(n==1){
            return 1;
        }
        sum=n+calsum(n-1);
        return sum;
    }
    public static void main(String args[]) {
        int n=5;
        System.out.println(calsum(n));
    }

    
}
