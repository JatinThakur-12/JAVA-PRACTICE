import java.util.*;
public class Pairsum_sortedrotated {
    public static void checksum(ArrayList <Integer> list,int target) {
        int pivot=-1;
        for(int i=0;i<list.size();i++) 
        {
            if(list.get(i)>list.get(i+1)){
                pivot=i; 
                break;  
            }
        }
        int rp=pivot;
        int lp=pivot+1;
        while(lp!=rp){
            int currsum=list.get(lp)+list.get(rp);
            if(currsum==target){
                System.out.println("sum of number:"+list.get(lp)+" "+list.get(rp));
                return;
            }
            else if(currsum<target){
                lp=(lp+1)%list.size();
            }else{
                rp=(list.size()+rp-1)%list.size();
            }
        }
        System.out.println("target not found");
        


    }
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int target=25;
        checksum(list, target);
        
    }

}
