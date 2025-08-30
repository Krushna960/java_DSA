import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 50;
        int[] ans = search(arr, target);
       System.out.println(Arrays.toString(ans));
    }

    static int[] search (int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0 ){
            if(matrix[r][c] == target ){
                return new int []{r,c};

            }else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int []{-1,-1};
    }
    
}
