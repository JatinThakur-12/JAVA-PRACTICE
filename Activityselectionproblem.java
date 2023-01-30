import java.util.*;
public class Activityselectionproblem {
    public static void main(String[] args) {
        // int start[]={3,1,0,5,8,5};
        // int end[]={4,2,6,7,9,9};
        int start[]={5,3};
        int end[]={7,5};
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function-> is a short form of big function  
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        for(int i=0;i<start.length;i++){
            System.out.println(activities[i][0]+" "+activities[i][1]+" "+activities[i][2]);
        }

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        
        //select 1 case
        maxAct=1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                maxAct++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }
        }

        System.out.println("Max Activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");

        }

    }
}
