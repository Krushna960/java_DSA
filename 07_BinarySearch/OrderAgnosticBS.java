
public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {10, 7, 5, 3, 1}; // Example of a descending sorted array
        // int[] arr = {1, 3, 5, 7, 10}; // Example of an ascending sorted array
        // int[] arr = {1, 2, 3, 4, 5}; // Example of an ascending sorted array
        // int[] arr = {5, 4, 3, 2, 1}; // Example of a descending sorted array 
        int target = 5;
        int ans = OrderAgnosticBinarySearch(arr, target);
        System.out.println("Element found at index: " + ans);
    }
    

    static int OrderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2; // To avoid overflow

            if (arr[mid] == target) {
                return mid; // Target found
            }
            // If the array is sorted in ascending order
            if (isAscending) {
                if (arr[mid] < target) {
                    start = mid + 1; // Search in the right half

                } else {
                    end = mid - 1; // Search in the left half
                }
            } else {
                // If the array is sorted in descending order
                if (arr[mid] > target) {
                    start = mid + 1; // Search in the right half
                } else {
                    end = mid - 1; // Search in the left half
                }
            }
        }
        return  -1; // Target not found
    }

}


    

