
public class infiniteArray {

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1; // this is my new start
            //double the box value
            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }

    //return the index
    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // int mid = (start + end ) / 2;
            int mid = start + (end - start) / 2; // To avoid overflow
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }

        }
        return -1; // Target not found
    }
}
