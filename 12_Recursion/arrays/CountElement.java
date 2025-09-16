import java.util.ArrayList;

public class CountElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,3};
        int target = 3; 
        // System.out.println(findAllIndex(arr, 0, target, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 0, target ));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, index+1, target, list);
    }
     static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target ){

        ArrayList<Integer> list = new ArrayList<>();

         //create a new list in each function call
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, index+1, target);
        
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
