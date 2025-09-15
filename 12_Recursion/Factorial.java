public class Factorial {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        System.out.println(sum(5));
    }
    static int factorial(int n){
        //base condition
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
