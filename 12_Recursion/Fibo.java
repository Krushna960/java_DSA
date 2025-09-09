public class Fibo {
    public static void main(String[] args) {
        //write a function to print fibonacci series
        int n=7;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
    
}
