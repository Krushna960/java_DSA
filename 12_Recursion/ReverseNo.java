public class ReverseNo {
    public static void main(String[] args) {
       reverse(1234);
      
    }
    static void reverse(int n){
        //base condition
        if(n==0){
            return ;
        }
        System.out.print(n%10);
         reverse(n/10);
    }
    
}
