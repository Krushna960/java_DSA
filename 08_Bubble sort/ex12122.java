import java.util.Arrays;
import java.util.Scanner;

public class ex12122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the arrays: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("arrays before sort: "+Arrays.toString(arr));
        BS(arr);
        System.out.println("arrays after sort: "+Arrays.toString(arr));
    }
    static void BS(int[] arr){
        boolean swaped;

        for(int i=0;i<arr.length;i++){
            swaped = false;
            for(int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
}
