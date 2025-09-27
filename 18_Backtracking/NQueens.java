public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println("Total ways to solve N-Queens: " + queens(board, 0));
    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        // placing the queen and checking for every row and column
        int count = 0;
        for(int col = 0; col < board.length; col++){
            // check if the queen can be placed or not
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        // vertical up
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }
        // diagonal left up
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        // diagonal right up
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
