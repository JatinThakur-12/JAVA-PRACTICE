public class recursion_practice_q {
    
    public static void find_key(int arr[],int idx,int key) {
        if(idx==arr.length){
            return;
        }
        else if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        find_key(arr, idx+1, key);
       
    }

    static String numstr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void number2string(int num) {
        if(num==0){
            return;
        } 
        int lastdigit=num%10;
        number2string(num/10);
        System.out.print(numstr[lastdigit]+" ");

    }
  
    public static int length(String str) {
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
    
    public static void substring(String str,int idx,String substr){
        substr+=str.charAt(idx);
        substring(str, idx+1, substr);
    }
    public static void main(String[] args) {
        String str="hakunamatata";
        System.out.println(str.substring(1));
        System.out.println(length(str));
       
        // //Convert number to string 
        // number2string(1975);
        // //Find Key
        // int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        // find_key(arr, 0, 2);
    }
}
