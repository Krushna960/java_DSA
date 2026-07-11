public class SumOFNatural {
    public static void main(String[] args) {
        int ans = sum(3);
        System.out.println(ans);
    }
    static int sum(int n){
        int total = 0;
        for(int i=0; i<=n;i++){
            total += i;
        }
        return total;
    }
}