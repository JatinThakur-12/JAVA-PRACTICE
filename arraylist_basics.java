import java.util.*;
public class arraylist_basics {
    public static void main(String[] args) {
        ArrayList<ArrayList> mainlist= new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<String> lsit4=new ArrayList<>();
        //add elements
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        lsit4.add("hello everyone");
        list2.remove(2);
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        mainlist.add(lsit4);
        System.out.println(mainlist);
        //traverse
        for(int i=0; i<mainlist.size();i++){
            ArrayList<Integer> currList=mainlist.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            
            System.out.println();       
        }

        
    }
}
