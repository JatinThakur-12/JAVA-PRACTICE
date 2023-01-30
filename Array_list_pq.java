import java.util.ArrayList;
import java.util.Arrays;
public class Array_list_pq {
    //monotonic
    public static boolean monotonic(ArrayList <Integer> list) {
        boolean inc=true,dec=false;
        for(int i=0,j=i+1;i<list.size()-1;i++,j++){
            if(list.get(i)<=list.get(j)){
                inc=true;
            }else{
                inc=false;
                break;
            }
        }
       
        if(inc==false){
            for(int i=0,j=i+1;i<list.size()-1;i++,j++){
                if(list.get(i)>=list.get(j)){
                    dec=true;
                }else{
                    dec=false;
                    break;
                }
            }
        }
        
        if(inc!=dec){
            return true;
        }
        return false;
    }

    //LONELY NUMBER IN ARRAYLIST
    public static ArrayList<Integer> lonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1;i<nums.length-1;i++){
            
            if(nums[i-1]<nums[i]&&nums[i+1]>nums[i]&&nums[i-1]+1<nums[i]&&nums[i+1]-1>nums[i]){
                list.add(nums[i]);
            }
            if(i==1){
                if(nums[i-1]+1<nums[i]){
                    list.add(nums[i-1]);
                }
            }
            if(i==nums.length-2){
                if(nums[i]<nums[i+1]&&nums[i]+1<nums[i+1]){
                    list.add(nums[i+1]);
                }
            }
        }
        System.out.println(list);
        return list;
    }
    //most frequent no in arraylist
    public static int mostfrequent(ArrayList<Integer> list,int key) {
        int n=list.size();
        int[] nums=new int[1001];
        int min=0;
        System.out.println(nums[0]); 
        for(int i=0;i<n-1;i++){
            if(list.get(i)==key){
                min=Math.min(min, list.get(i+1));
                nums[list.get(i+1)]++;
            }
        }
        int maxtarget=0;
        int target=0;
        for(int i=min;i<1001;i++){
            if(nums[i]>0){
                if(nums[i]>maxtarget){
                    maxtarget=nums[i];
                    target=i;
                }
                
            }
        }
        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        System.out.println(mostfrequent(nums, 2));
        
        /*
        //for lonely number
        int[] nums={1,3,5,3};
        System.out.println(lonely(nums));*/

        /*
        //FOR MONOTONIC
        ArrayList <Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(monotonic(list));*/
    }
}
