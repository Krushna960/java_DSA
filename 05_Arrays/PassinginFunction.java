
import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        // Example of passing an array to a function
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        printArray(numbers);
        System.out.println("After change: " + Arrays.toString(numbers));
    }

    // Function to print elements of an array
    static void printArray(int[] arr) {
        arr[0] = 10; // Modifying the first element
    }
}