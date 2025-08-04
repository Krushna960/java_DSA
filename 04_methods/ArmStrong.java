public class ArmStrong {
    public static void main(String[] args) {
        int number = 153; // Example number to check
        isArmStrong(number);
        System.out.println("Is " + number + " an Armstrong number? " + isArmStrong(number));
    }   
    static boolean isArmStrong(int n){
        int orignal = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += rem*rem*rem;
            n /= 10; 
        }
        return sum == orignal;
    }
}
