public class MagicNumber{
    //amazon interview question
    public static void main(String[] args) {
        int n = 5;

        int ans = 0;
        int base = 5; // 5 is 101 in binary
        while(n>0){
            int lastBit = (n & 1);
            n = n >> 1;

            ans += (lastBit * base);
            base = base * 5;
        }

        System.out.println(ans);
    }
}