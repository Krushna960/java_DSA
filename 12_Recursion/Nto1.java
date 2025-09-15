public class Nto1 {
    public static void main(String[] args) {
        // printNto1(5);
        // print1toN(5);
        printboth(5);
    }
    static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }
    static void print1toN(int n) {
        if (n == 0) {
            return;
        }
       
        print1toN(n - 1);
        System.out.println(n);
    }
    static void printboth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printboth(n - 1);
        System.out.println(n);
      
    }
}
