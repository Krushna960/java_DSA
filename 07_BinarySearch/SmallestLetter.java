public class SmallestLetter {
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
       
    }
     public char nextGreatestLetter(char[] letters, char target) {
        // but what if the target is greater than the greatest number in the array
        
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            // int mid = (start + end ) / 2;
            int mid = start + (end - start) / 2; // To avoid overflow
            
            if(letters[mid] < target) {
                start = mid + 1; // Search in the right half
            }else{
                end = mid - 1; // Search in the left half
            }
            
            
        }
        return letters[start % letters.length];
    }
}

