public class exex {
    public static void main(String[] args) {
        int[] arr = {3,0,5,2,1,4};
        CS(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void CS(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}
