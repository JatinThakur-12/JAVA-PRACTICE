
public class patterns {
    public static void hollowrect(int row,int col) {
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (i==0||i==row-1||j==0 || j==col-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
    public static void inverted_rotated_half_pyramid(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j>=row-i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int row) {
            for (int i=0;i<row;i++){
                for(int j=1;j<row-i+1;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    
        
    }
    public static void floydtriangle(int row) {
        int counter=0;
        for(int i=1; i<=row; i++){
            for (int j=0;j<i;j++ ){
                System.out.print(++counter+" ");
            }
            System.out.println();
        }
        
    }
    public static void _0_1triangle(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }

            }
            System.out.println();

        }

    }
    public static void butterfly(int n) {
        for(int i=1;i<=n;i++){
            //for stars i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces 2(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //for stars i
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }
            //for spaces 2(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*for(int i=1;i<=row/2;i++){
            for(int j=1;j<=row;j++){
                if(j<=i||j>row-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<row/2;i++){
            for(int j=1;j<=row;j++){
                if(j<row/2-i+1||j>row/2+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        
    }

    public static void solid_rhombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(i==1||i==n||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

                
            }
            System.out.println();
        }
    }
    public static void diamond(int n) {
       
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
      
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }

    }

    public static void number_pyramid(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
           
        }
    }
    public static void palindromic_number_pyramid(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            int k=i;
            int f=1;
            for(int j=1;j<=2*i-1;j++){
                
                if(k>0){
                    System.out.print(k--);
                }
                else{
                    System.out.print(++f);
                }
            }
            System.out.println();
           
        }
    }
   
    public static void main(String args[]) {
        
        System.out.println("hollow rect".toUpperCase());
        hollowrect(5, 10);
        
        System.out.println("");
        System.out.println("half_pyramid".toUpperCase());
        inverted_rotated_half_pyramid(10, 10);

        System.out.println("");
        System.out.println("inverted_half_pyramid".toUpperCase());
        inverted_half_pyramid(10);

        System.out.println("");
        System.out.println("floyd triangle".toUpperCase());
        floydtriangle(5);

        System.out.println("");
        System.out.println("zero one triangle".toUpperCase());
        _0_1triangle(5);

        System.out.println("");
        System.out.println("butterfly".toUpperCase());
        butterfly(9);

        System.out.println("");
        System.out.println("solid_rhombus".toUpperCase());
        solid_rhombus(7);

        System.out.println("");
        System.out.println("hollow_rhombus".toUpperCase());
        hollow_rhombus(5);

        System.out.println("");
        System.out.println("diamond".toUpperCase());
        diamond(5);

        System.out.println("");
        System.out.println("number_pyramid".toUpperCase());
        number_pyramid(5);

        System.out.println("");
        System.out.println("palindromic_number_pyramid".toUpperCase());
        palindromic_number_pyramid(5);
    }

    
}
