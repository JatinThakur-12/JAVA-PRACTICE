public class array_searchtech {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binary_search(int array[], int val){
        int start= 0;
        int end= array.length-1;
        while( start<=end ){
            int mid = ( start + end ) / 2;
            if ( array[mid] == val){
                return mid; 
            }
            if(array[mid] < val){
                start=mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;

    }   

    public static void main(String args[]) {
        int arr[]={3,4,7,8,10,12,15,17,20};
        int key=15;
        // int flag=linearsearch(arr,key);
        System.out.println(key+" is found at index "+binary_search(arr,key)+".");

        // if(flag){
        //     System.out.println(key+" is found at index "+ flag +".");
        // }
        // else{
        //     System.out.println(key+" not found in the array.");
        // }
        
    }
}
