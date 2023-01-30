import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int W=50;
        
        double ratio[][]=new double[weight.length][2];
        //0th col=idx; 1st col= ratio;

        for(int i=0;i<weight.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        //ascending sort
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capacity= W;
        double finalval=0;
        for(int i=weight.length-1;i>=0;i--){//making ascending -> descending by traversing it in reverse order
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){//include full item
                capacity-=weight[idx];
                finalval+=value[idx];
            }else{//include fraction of the item
                finalval+=capacity*ratio[i][1];
                capacity=0;
                break;
            }
        }
        System.out.println("Final Value="+finalval);
    }
}
