public class ex2312 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SS(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void SS(int arr[]){
        for(int i=0;i<arr.length; i++){
            int last = arr.length-i-1;
            int maxindex = maxindex(arr, 0, last);

            swap(arr, maxindex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxindex(int[] arr, int start, int last){
        int maxx = start;
        for(int i=start; i<=last; i++){
            if(arr[maxx]<arr[i]){
                maxx=i;
            }
        }
        return maxx;
    }

}
