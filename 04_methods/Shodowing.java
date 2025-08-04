public class Shodowing {
    static int a = 10; // class variable
    public static void main(String[] args) {
        System.out.println(a);//10
        int a; // local variable, shadows the class variable
        //System.out.println(a); // this will cause an error because 'a' is not initialized
        a=20;
        System.out.println(a);//20
        fun();
    }
    static void fun(){
        System.out.println(a);
    } 
}
