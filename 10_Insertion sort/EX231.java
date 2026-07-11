public class EX231 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 7, 1, 8, 3, 2};
        IS(arr);
        System.out.println(java.util.Arrays.toString(arr));
    } 
    static void IS(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
