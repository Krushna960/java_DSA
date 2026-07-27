import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class main{
    public static void countSort(int[] array){
        if(array == null || array.length <= 1){
            return;
        }

        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }

        int[] countArray = new int[max + 1];

        for(int num : array){
            countArray[num]++;
        }

        int index = 0;
        for(int i=0; i<= max; i++){
            while(countArray[i] > 0){
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }

    public static void CountSortHas(int[] array){
        if(array == null || array.length <= 1){
            return;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for(int i=min; i<= max; i++){
            int count = countMap.getOrDefault(i, 0);
            for(int j=0; j< count; j++){
                array[index] = i;
                index++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }
}