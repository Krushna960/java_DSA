
public class Main {

    public static void main(String[] args) {
        int[] num = {11, 22, 33, 44, 55};
        int target = 44;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }

        }
        return -1;
    }
}
