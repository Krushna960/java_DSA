
public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(arr, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        //check for first occurence if target 
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    //this function will find the last occurence of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // int mid = (start + end ) / 2;
            int mid = start + (end - start) / 2; // To avoid overflow

            if (target > nums[mid]) {
                start = mid + 1; // Search in the right half
            } else if (target < nums[mid]) {
                end = mid - 1; // Search in the left half
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // search in left half
                } else {
                    start = mid + 1; // search in right half
                }

            }
        }

        return ans;
    }
}
