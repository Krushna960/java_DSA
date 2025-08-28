public class Floor {
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 12,14,16,18};
        int target = 15;
        int result = floor(arr, target);
        System.out.println("Element found at index: " + result);    

       
    }
    //return the index smaller than or equal to target
    static int floor(int[] arr , int target){
        // what if the target is smaller than the smallest number in the array
        if(target < arr[0]){
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
        return end;
    }
}


