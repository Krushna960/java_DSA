
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][];

        // int[][] arr = {
        //     {1, 2, 3},//0th index
        //     {4, 5, 6, 7},//1st index
        //     {8, 9}//2nd index -> arr[2] = {8, 9}
        // };
        int arr[][] = new int[3][2];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

}
