public class spiralmatrix {
    public static void spiral(int matrix[][]) {
        int top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        int left=0;
        while(top<=bottom && left<=right){
            //top
            for(int j=left;j<=right;j++){
                System.out.print(matrix[top][j]);
            }
            //right
            for(int i=top+1;i<=bottom;i++){
                System.out.print(matrix[i][right]);
            }
            //bottom
            for(int j=right-1;j>=left;j--){
                if(top==bottom){
                    break;
                }
                System.out.print(matrix[bottom][j]);
            }
            //left
            for(int i=bottom-1;i>top;i--){
                if(left==right){
                    break;
                }
                System.out.print(matrix[i][left]);
            }
            top++;
            right--;
            bottom--;
            left++;
            
            
        }

        
    }
    public static void main(String args[]) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        // int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8}};
       spiral(matrix);
    }
}
