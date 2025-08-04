public class Loops {
    public static void main(String[] args) {
        
        /*
         * syntax for for loop:
         * for (initialization; condition; increment/decrement) {
         * body of loop
         * }
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        /*
         * syntax for while loop:
         * while (condition) {
         * body of loop
         * }
         */
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        /*
         * syntax for do-while loop:
         * do {
         * body of loop
         * } while (condition);
         */
        int k = 0;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k < 5);
    }
}
