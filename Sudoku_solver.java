public class Sudoku_solver {
    public static boolean isSafe(int sudoku[][], int row, int col,int digit) {
        //vertical check
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //horizontal check
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //box check(3 x 3 grid)
        int sr= (row/3)*3;//row of sarting point of 3x3 
        int sc= (col/3)*3;//col of sarting point of 3x3

        for(int i=sr; i<sr+3;i++){ 
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
         
        return true;
    }
    public static boolean sudokusolver(int sudoku[][], int row,int col) {
        //base case
        if(row==9&& col==0){
            return true;
        }
        //recursion
        int nxtrow=row,nxtcol=col+1;
        if(nxtcol==9){
            nxtrow=row+1;
            nxtcol=0;
        }
        if(sudoku[row][col]!=0){
           return sudokusolver(sudoku, nxtrow, nxtcol);
        }
        
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku, row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokusolver(sudoku, nxtrow, nxtcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
         }
        return false;
    }
    public static void print(int sudoku[][]){
        for(int i=0;i<sudoku.length;i++){
            if(i%3==0&&i!=0){
                System.out.println("------+------+------");
            }
            for(int j=0;j<sudoku[i].length;j++){
                if(j%3==0&&j!=0){
                    System.out.print("|");
                }
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoku={
        { 0, 0, 8,/*-*/  0, 0, 0, /*-*/  0, 0, 0},
        { 4, 9, 0,/*-*/  1, 5, 7, /*-*/  0, 0, 2},
        { 0, 0, 3,/*-*/  0, 0, 4, /*-*/  1, 9, 0},
        /*--------------------------------------*/
        { 1, 8, 5,/*-*/  0, 6, 0, /*-*/  0, 2, 0},
        { 0, 0, 0,/*-*/  0, 2, 0, /*-*/  0, 6, 0},
        { 9, 6, 0,/*-*/  4, 0, 5, /*-*/  3, 0, 0},
        /*----------------------------------------*/
        { 0, 3, 0,/*-*/  0, 7, 2, /*-*/  0, 0, 4},
        { 0, 4, 9,/*-*/  0, 3, 0, /*-*/  0, 5, 7},
        { 8, 2, 7,/*-*/  0, 0, 9, /*-*/  0, 1, 3}
        };
        print(sudoku);
        if(sudokusolver(sudoku, 0, 0)){
            System.out.println("\n\nSolution exsist\n");
            print(sudoku);
        }else{
            System.out.println("Solution doesn't exist.");
        }
    }
}