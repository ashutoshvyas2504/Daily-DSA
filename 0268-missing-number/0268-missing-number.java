class Solution {
    public int missingNumber(int[] nums) {

        int actualSum = 0;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
        }

        for (int i = 1; i <= nums.length; i++) {
            actualSum = actualSum + i;
        }
            
            int ans = actualSum - currSum;

            return ans;
    }
}