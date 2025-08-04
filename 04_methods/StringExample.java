
import java.util.Scanner;

//package methods;
public class StringExample{
    public static void main(String[] args) {
        // String msg=greet();
        // System.out.println(msg);

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = in.next();
        String greeting = myGrert(name);
        System.out.println(greeting);
    }
    static String greet(){
        String greeating = "how are you";
        return greeating;
    }
    static  String myGrert(String name){
        return "Hello, " + name + "!";
    }
}