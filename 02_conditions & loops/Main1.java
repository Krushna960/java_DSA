
public class Main1 {

    public static void main(String[] args) {
        /*  
         * syntax for if statement:
         * if (condition) {
         * body of if statement
         * } else {
         * body of else statement
         * }
         */
        int salary = 10000;
        if (salary > 10000) {
            System.out.println("You are a millionaire");
        } else {
            System.out.println("You are not a millionaire");
        }
        /*
         * syntax for if-else if statement:
         * if (condition1) {
         * body of if statement
         * } else if (condition2) {
         * body of else if statement
         * } else {
         * body of else statement
         * }
         */
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}
