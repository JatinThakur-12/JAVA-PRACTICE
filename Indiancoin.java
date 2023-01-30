import java.util.*;
public class Indiancoin{
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        ArrayList<Integer> ans=new ArrayList<>();
        int coincount=0;
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;
        for(int i=0;i<coins.length;i++){
            while(coins[i]<=amount){
                amount-=coins[i];
                coincount++;
                ans.add(coins[i]);
            }
        }
        System.out.println("Total coin="+coincount);
        System.out.println(ans);
    }
}