public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(find(arr, 0, target));
        System.out.println(findIndex(arr, 0, target));
    }
    static boolean find(int[] arr, int index, int target){
        //base condition
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, index+1, target);
    }
    static int findIndex(int[] arr, int index, int target){
        //base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, index+1, target);
        }
    }
    static int findIndexFromLast(int[] arr, int index, int target){
        //base condition
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndexFromLast(arr, index-1, target);
        }
    }

    
}
