public class temp{
    public static void transform(int[][] arr) {
        int temp[][]=new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++)
        //     {   
        //         temp[i][j]=arr[i][j];
        //     }  
        // }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {   
                arr[i][j]=0;
            }  
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {   
                System.out.print(temp[i][j]);
            }  
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {   
                System.out.print(arr[i][j]);
            }  
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // transform(arr);
        int a=2,b=4;
        System.out.println(Math.max(a,b));
    }
}