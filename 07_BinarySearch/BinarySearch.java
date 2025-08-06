public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = BinarySearch(arr, target);
        System.out.println("Element found at index: " + result);    

       
    }
    //return the index
    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end ) / 2;
            int mid = start + (end - start) / 2; // To avoid overflow
            if (arr[mid] == target) {
                return mid; // Target found
            }else if(arr[mid] < target) {
                start = mid + 1; // Search in the right half
            }else{
                end = mid - 1; // Search in the left half
            }
            
            
        }
        return -1; // Target not found
    }
}
