public class backtracking {
    public static void findsubset(String str,int i,String ans) {
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        findsubset(str, i+1, ans+str.charAt(i));
        findsubset(str, i+1, ans);
    }
    public static void findpermutation(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion-> O(n*n!) for a=calculating 1 permutation it takes n time so to do n! it takes n*n!.
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde" if i pointing index of c then -> "ab"+"de"="abde" new string 
            String newstr=str.substring(0, i)+str.substring(i+1);
            findpermutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        // //for finding subsets
        // String str="abc";
        // findsubset(str,0,new String(""));
        
        
        //for finding permutations
        String str="abc";
        findpermutation(str, new String(""));

    }
}
