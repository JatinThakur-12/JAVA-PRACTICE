// import java.util.*;
public class traping_rainwater {
    public static int trapwater(int height[]) {
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        //calculating left max boundary --array
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }
        //calculating right max boundary --array
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }
        //calculating volume of water
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedwater+= (waterlevel-height[i])*1;
            
        }
        return trappedwater;


    }
    public static void main(String args[]) {
        int height[]={4,2,0,6,3,2,5};
        // int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Volume of trapped rain water is "+trapwater(height)+" units.");

    }
}
