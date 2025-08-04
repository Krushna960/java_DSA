public class Overloading {
    public static void main(String[] args) {
        fun(33);
        fun("Hello");
    }
    static void fun(int a){
        System.out.println("Integer: " + a  );
    }
    static void fun(String name){
        System.out.println("String: " + name);
    }
    
}
