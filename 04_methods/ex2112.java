public class ex2112 {
    public static void main(String[] args) {
        PrintArmStrong(153);
    }
    static void PrintArmStrong(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n%10;
            sum = sum +  rem*rem*rem;
            n = n/10;
        }
        if(sum == original){
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("Not an ArmStrong Number");
        }
    }

}
