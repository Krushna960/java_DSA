//package methods;
import java.util.Scanner;
public class Mainc {
    public static void main(String[] args) {
        
        // int ans=sum2();
        // System.out.println("The sum from sum2 is: " + ans);

        int ans = sum3(10,20);
        System.out.println(ans);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();   
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();   
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        return a + b;
    }
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }
}
