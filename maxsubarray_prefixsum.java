public class maxsubarray_prefixsum {
    public static void prefixsum( int arr[]) {
        int prefixarr[]= new int[arr.length];
       int maxsum=Integer.MIN_VALUE;
        int sum=0;
       prefixarr[0]=arr[0];
        for(int i=1;i<prefixarr.length;i++){
            prefixarr[i]= prefixarr[i-1]+arr[i];
        }
        for(int i=0;i<prefixarr.length;i++){
            System.out.print(prefixarr[i]);
        }
        System.out.println();
      
        for(int i=0;i<prefixarr.length;i++){
            for(int j=i;j<prefixarr.length;j++){
                sum = (i==0)?prefixarr[j]:prefixarr[j]-prefixarr[i-1];
                if(maxsum<sum){
                    maxsum=sum;
                }
                System.out.println(sum);
            }
        }
        System.out.println("Maximum sum="+maxsum);

    }
    public static void main(String args[]) {
        // int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int arr[]={1,-2,6,-1,3};
        prefixsum(arr);
      


    }
}
