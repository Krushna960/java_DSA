public class SearchInRange {
    public static void main(String[] args) {
         int[] num = {11, 22, 33, 44, 55,66,77};
        int target = 44;
        int ans = linearSearch(num, target,1,4);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }

        }
        return -1;
    
    }
    
}
