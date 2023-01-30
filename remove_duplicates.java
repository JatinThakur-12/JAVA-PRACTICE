public class remove_duplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[]) {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar!=' '){
            if(map[currchar-'a']== true){
                removeDuplicates(str, idx+1, newStr, map);
            }else{
                map[currchar-'a']=true;
                removeDuplicates(str, idx+1, newStr.append(currchar), map);
            }
        }else{
            removeDuplicates(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String arr="appnnacollege";
        // String arr="the quick brown fox jumps over lazy dog";
        removeDuplicates(arr, 0,new StringBuilder(""), new boolean[26]);
    }
}
