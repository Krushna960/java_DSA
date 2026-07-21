import java.math.BigDecimal;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        BD();
    }
    static void BD(){
        double x = 0.03;
        double y = 0.04;
        // double ans = y-x;
        // System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");

        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

            BigDecimal a = new BigDecimal("456576345675.4546376");
    BigDecimal b = new BigDecimal("547634565352.986785764");

    // operations
    System.out.println(b.add(a));
    System.out.println(b.subtract(a));
    System.out.println(b.multiply(a));
    System.out.println(b.pow(2));
    System.out.println(b.negate());
    }

    static void BI(){
        int a = 30;
        int b = 67;

        BigInteger B = BigInteger.valueOf(a);
        int c = B.intValue(); // convert BigInteger to int
        BigInteger C = new BigInteger("34567898765432");
        BigInteger X = new BigInteger("567842");

        //constants
        BigInteger D = BigInteger.TEN;

        //operations
        BigInteger sum = C.add(X);
        BigInteger mul = C.multiply(X);
        BigInteger diff = C.divide(X);
        BigInteger sub = C.subtract(X);

        if(X.compareTo(C) < 0){
            System.out.println("Yes, X is less than C");
        }

        // System.out.println(Factorial.fact(100));
    }
}
