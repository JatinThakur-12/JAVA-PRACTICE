public class optimised_power {
    public static long op(int a ,int n){
        if(n==0){
            return 1;
        }
        long halfPower=op(a,n/2);
        long halfPowerSq= halfPower * halfPower;
        //if power is odd
        if(n%2!=0){
            halfPowerSq *= a;
        } 
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a=2,n=50;
        System.out.println(op(a, n));
    }
}
