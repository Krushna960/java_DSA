
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
        multiple(1,2, "Hello", "World", "Java", "python", "c++");    }

    static void multiple(int a, int b, String ...v){
        System.out.println("Integer values: " + a + ", " + b);
        System.out.println("String values: " + Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
