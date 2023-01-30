import java.util.*;
public class Chocolaproblem {
    public static void main(String[] args) {
        int X[] = {2, 1, 3, 1, 4};
        int Y[] = {4, 1, 2};
        int M=6,N=4;
        int r=-10;
        System.out.println((r & 1) > 0);
        Arrays.sort(X);
        Arrays.sort(Y);
        
        int h=N-2,v=M-2;
        int hp=1,vp=1;
        int cost=0;
        
        while(h>-1 && v>-1){
            if(X[v]<=Y[h]){
                cost+= Y[h]*vp;
                hp++;
                h--;
            }else{
                cost+= X[v]*hp;
                vp++;
                v--;
            }
        }
        while(h>-1){
            cost+= Y[h]*vp;
            hp++;
            h--;
        }
        while(v>-1){
            cost+= X[v]*hp;
            vp++;
            v--;
        }

        System.out.println("Cost="+cost);
    }
}
