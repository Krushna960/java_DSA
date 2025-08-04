
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from the user till does not press X or x

        int ans = 0;
        while (true) {
            System.out.print("enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("enter the values:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num1 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '*') {
                    ans = num1 * num2;
                }

            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator.");
                break; // Exit the loop if 'x' or 'X' is pressed
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
            System.out.println("Result: " + ans);
        }
    }
}
