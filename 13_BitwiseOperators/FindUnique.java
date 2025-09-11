public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println(findUnique(arr));
    }
    private static int findUnique(int[] arr){
        int unique = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            unique = unique ^ arr[i];
        }

        return unique;
    }

}
