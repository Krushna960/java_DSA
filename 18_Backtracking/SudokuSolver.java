public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solveSudoku(board)){
           display(board);
        }else{
            System.out.println("Cannot solve the Sudoku");
        }
    }

    static boolean solveSudoku(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        //this is how we are replacing the r,c from arguments to the function
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            //if you found some empty element in the row, then break
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
            return true;// sudoku is solved
        }
        // backtracking
        for(int num = 1; num <= n; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                if(solveSudoku(board)){
                    //found the solution
                    //display(board);
                    return true;
                }else{
                    board[row][col] = 0; // backtrack
                }
            }
        }
        return false;
    }

    static void display(int[][] board){
        for(int r = 0; r < board.length; r++){
            for(int d = 0; d < board.length; d++){
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if((r + 1) % (int)(Math.sqrt(board.length)) == 0){
                System.out.print("");
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        // check for the row
        for(int i = 0; i < board.length; i++){
            //check if number is already present in the row
            if(board[row][i] == num){
                return false;
            }
        }
        // check for the column
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }
        // check for the grid
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
