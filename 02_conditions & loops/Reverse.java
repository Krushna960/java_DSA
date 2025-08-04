public class Reverse {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        while(num>0){
            int rem = num % 10; // Get the last digit
            reversed = reversed * 10 + rem; // Build the reversed number
            num = num / 10; // Remove the last digit
        }
        System.out.println("Reversed Number: " + reversed); // Print the reversed number
    }
}
