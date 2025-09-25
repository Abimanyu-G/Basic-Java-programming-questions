public class findNum{
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        Solution sol = new Solution();

        int missing = sol.missingNumber(nums);

        System.out.println("Missing number: " + missing);
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0;

        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int actualNum = (nums.length * (nums.length+1)/2);
        int missingNum = actualNum - sum;
        return  missingNum;
    }
}
