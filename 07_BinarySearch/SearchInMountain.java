public class SearchInMountain {
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,3,1};
    int target = 3; 
    SearchInMountain searcher = new SearchInMountain();
    System.out.println(searcher.Search(arr, target));
   }
   //https://leetcode.com/problems/find-in-mountain-array/

   int Search(int[] arr, int target){
    int peak = peakIndexInMountainArray(arr);
    int firstTry = OrderAgnosticBinarySearch(arr, target, 0, peak);
    if(firstTry != -1){
        return firstTry;
    }
    //try to search in the second half
    return OrderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);    

    }

    static int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;


        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                //you are in the decreasing part of the array
                //this may be the ans but look at left side
                end = mid;
            }else{
                //you are in the increasing part of the array
                start = mid + 1; // because we know that mid + 1 element is greater than mid element
            }
        }

        // in the end, start == end and pointing to the largest number because of the 2 checks above
        //  hence, we can return either start or end
    
        return start; // or return end as both are equal
    }
    static int OrderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
    
        //find whether the array is sorted in ascending or descending
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
