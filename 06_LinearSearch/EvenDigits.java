public class EvenDigits {
    public static void main(String[] args) {
       int[] nums = {18,124,9,1764,98,1};
       System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    //fun to cheack even or not 
    static boolean even(int num){
        int numberOfDigits = digits(num);
        // if(numberOfDigits % 2 == 0){
        //     return true;
        // }
        return numberOfDigits % 2 ==0;
    }

    static int digits(int num){

        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        int count =0;

        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }

    
}
