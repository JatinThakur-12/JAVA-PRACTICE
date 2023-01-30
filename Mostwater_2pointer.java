import java.util.*;
public class Mostwater_2pointer {
    public static void calculate_water(ArrayList<Integer> height) {
        int lp=0;//left pointer
        int rp=height.size()-1;//right pointer
        int max=Integer.MIN_VALUE;
        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp)); //MIN_VALUE(height.get(lp),height.get(rp));
            int width= rp-lp;
            int currwater= ht*width;
            max= Math.max(max, currwater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println("max height of water is:"+max);

    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(8);

        calculate_water(height);
    }
}
