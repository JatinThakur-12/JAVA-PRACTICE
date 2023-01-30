public class recursion_basics_question {
    public static int fibonacci(int n) {
        if(n==0||n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fibn= fnm1+fnm2;
        return fibn;

    }


    public static boolean isSorted (int arr[], int i) {
        if ( i==arr.length-1){
        return true; 
        }
        if (arr[i]>=arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurence(int arr[], int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key,int i) {
        if(i==arr.length){
            return -1;
        }   
        int isFound= lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void binaryString(int n, int lastdigit, String str) {
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str+'0');
        if(lastdigit==0){
            binaryString(n-1,1, str+'1');
        }
    }
    public static void main(String args[]) {
        int n=4;
        binaryString(n, 0,new String(""));
        
        // //LAST OCCURENCE
        // int arr[]={8,3,6,9,5,10,2,5,3,5  };
        // System.out.println(lastOccurence(arr, 5, 0));

        // //FIRST OCCURENCE
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));


        // //IS SORTED
        // int arr[]={1,2,3,4,7,6};
        // System.out.println(isSorted(arr,0));


        ////FIBONACCI SERIES
        // int n=44;
        // // System.out.println(fibonacci(n));
        // for(int i=0;i<=n;i++){ 
        //     System.out.print(fibonacci(i)+" ");
        // }
    }
}
