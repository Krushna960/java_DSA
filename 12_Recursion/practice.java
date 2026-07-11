import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = {23,65,34,87,1,4,6,2,8,55};
        int target = 87;
        // System.out.println(fact(5));
        // System.out.println(sum(5));
        // System.out.println(Digitproduct(1234));
        // System.out.println(fibo(6));
        // print1toN(6);
        // printNto1(6);
        // int ans = binarysearch(arr, target, 0, arr.length-1);
        // System.out.println(ans);
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return n + sum(n-1);
    }
    static int Digitproduct(int n ){
        if (n%10 == 0) {
            return 1;
        }
        return (n%10) * Digitproduct(n-1);
    }
    static int fibo(int n ){
         if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static void print1toN(int n){
        if(n == 0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }
    static void printNto1(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        printNto1(n-1);
    }
    static int binarysearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }

        if(arr[m] < target){
            return binarysearch(arr, target, m+1, e);
        }

        return binarysearch(arr, target, s, m-1);
    }

    static void bubbleSort(int[] arr, int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];  
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }

    static void selectionsort(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c] > max){
                selectionsort(arr, r, c+1, c);
            }else{
                selectionsort(arr, r, c+1, max);
            }
        }
        
    }

}
