import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr =new int[5]; 
        //array of primatives
        arr[0] = 16;
        arr[1] = 15;
        arr[2] = 14;
        arr[3] = 13;
        // arr[4] = 11;
        System.out.println(arr[3]);

        //inputs using for loops
        // for (int i=0;i<arr.length;i++ ) {
        //     arr[i] = in.nextInt();
        // }
        // for (int i=0;i<arr.length;i++ ) {
        //     System.out.print(arr[i]+" ");
        // }

        //arrays of objects
        String[] str = new String[5];
        for(int i = 0 ; i < str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }

    
}
