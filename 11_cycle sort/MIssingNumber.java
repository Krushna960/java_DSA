//https://leetcode.com/problems/missing-number/
//Amazon question

public class MIssingNumber {
   
    public int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }

        }
        //search for first missing number
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        //case 2: all numbers are present
        return arr.length;
    }
    
}
