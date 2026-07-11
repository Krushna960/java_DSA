public class SquareRoot {
    public static void main(String[] args) {
        int X = 8;
        int result = sqrt(X);
        System.out.println("The square root of " + X + " is: " + result);
    }
    static int sqrt(int X){
        if(X==0 || X==1){
            return X;
        }
        int s=1;
        int e=X;
        int ans=0;
        while(s<=e){
            int mid = s + (e-s)/2;
            int sq = mid*mid;
            if(sq == X){
                return mid;
            }else if(sq > X){
                e = mid-1;
            }else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
}
