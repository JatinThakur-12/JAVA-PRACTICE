import java.util.*;
public class pairsum_2pointer {
    public static boolean checksum(ArrayList <Integer> list, int target) {
        int lp=0,rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("NO's are-->"+list.get(lp)+" "+list.get(rp));
                return true;
            }else if(list.get(lp)+list.get(rp)>target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        //array must be sorted
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=12;
        if(checksum(list, target)){
            System.out.println("pairsum found");
        }
        else{
            System.out.println("pairsum not found");
        }

    }
}
