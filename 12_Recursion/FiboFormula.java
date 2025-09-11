public  class FiboFormula {
    public static void main(String[] args) {
        int n = 10; // Example input
        // for(int i=0;i<n+1;i++){
        // System.out.println(fibo(i));
        // }
        System.out.println(fibo(55));
    }
    static int fibo(int n) {
       return (int)(Math.pow(((1 + Math.sqrt(5)) / 2),n) / Math.sqrt(5));
    }
}