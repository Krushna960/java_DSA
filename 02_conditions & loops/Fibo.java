import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = a + b; // Calculate next Fibonacci number
            a = temp; // Update a to the previous b
            count++;
        }
        System.out.println(b); // Print the nth Fibonacci number
    }    
}
