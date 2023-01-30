public class buysellstock {
    public static int buyandsell(int price[]) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0; 
        int buyat=0;
        int sellat=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit= price[i]-buyprice;
                if(maxprofit<profit){
                    maxprofit=profit;
                    buyat= buyprice;
                    sellat=price[i];
                }
            }
            else{
                buyprice=price[i]; 
            
            }
        }
        System.out.println("You should buy at:"+buyat);
        System.out.println("You should sell at:"+sellat);
        return maxprofit;
    }
    public static void main(String args[]) {
        int prices[]={7,1,5,3,6,4};  
        // int prices[]={7,6,4,3,1};  
        int maxprofit=buyandsell(prices);
        System.out.println("The maximum profit you can make is:"+maxprofit); 

    }
}
