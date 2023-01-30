public class subarray {
    public static void subarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(k!=j){       
                        System.out.print(arr[k]+"+");
                    }
                    else{
                        System.out.print(arr[k]);
                    }
                }
                System.out.print("="+sum);
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subarr(arr);

    }
}
