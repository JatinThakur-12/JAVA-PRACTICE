public class fibonacci {
    static void fib(int n)
    {
        int a = 0, b = 1, c;
        System.out.print(a+" "+b+" ");
        if (n == 0)
            return;
        for (int i = 2; i <= n; i++)
        {   
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
        
    }
    public static void main (String args[])
    {
        int n = 50;
        System.out.println("Made by SIMRAN THAKUR");
       fib(n);
    }

}
