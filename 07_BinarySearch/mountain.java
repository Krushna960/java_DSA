public class mountain {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
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
}