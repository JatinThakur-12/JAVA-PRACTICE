public class mergesort_forarray {
    public static String[] merge_sort(String arr[],int si,int ei) {
        if(si==ei){
            String a[]= {arr[si]};
            return a;
        }
        int mid= si+(ei-si)/2;
        String[] arr1= merge_sort(arr, si, mid);
        String[] arr2= merge_sort(arr, mid+1, ei);
        String[] arr3= merge(arr1,arr2);
        // System.out.println("arr3 called of mergesort");//for understanding controlflow
        return arr3;

    }
    public static String[] merge(String arr1[],String arr2[]) {
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3=new String[m+n];
        // //for understanding
        // System.out.println(m+n);
        int idx=0;
        int i=0;
        int j=0;
        
        while(i<m&&j<n) {
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
            arr3[idx] =arr1[i];
            i++;idx++;
            }
            else{
            arr3[idx] =arr2[j];
            j++;
            idx++;
            }
        }
        while(i<m) {
            arr3[idx] =arr1[i];
            i++;
            idx++;
        }
        while(j<n) {
            arr3[idx] =arr2[j];
            j++;
            idx++;
        }
        // //for understanding
        // for (int l=0;l<m+n;l++){
        //     System.out.println("arr3="+arr3[l]);
        // }
        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String arr1,String arr2) {
        if(arr1.compareTo(arr2)<0){
            return true;
        }
        return false;
    }   
    
    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        String newarr[]=merge_sort(arr,0,arr.length-1);
        for (int i=0;i<=newarr.length-1;i++){
            System.out.println(newarr[i]);
        }
    }
}