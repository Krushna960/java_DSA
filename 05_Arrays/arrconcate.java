import java.util.Scanner;
class Solution {
    public int[] getConcatenation(int[] nums) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter th size of the array:");
        int n = in.nextInt();

        nums = new int[n] ;
        System.out.println("enter the elements of the array:");

        for (int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        System.out.println(nums);
        int[] ans = new int[n+n];
        for(int i=0;i<ans.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        
        return ans;

    }
}



