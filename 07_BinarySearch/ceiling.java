public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 14,16,18};
        int target = 15;
        int result = ceiling(arr, target);
        System.out.println("ceeiling found at index: " + result);    

       
    }
    //return the index greaster than or equal to target
    static int ceiling(int[] arr , int target){
        // but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
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
        return start; 
    }
}
