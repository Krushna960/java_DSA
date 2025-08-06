public class FindMin {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,2,55,66,77,88};
        System.out.println(min(arr));

    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    
}
