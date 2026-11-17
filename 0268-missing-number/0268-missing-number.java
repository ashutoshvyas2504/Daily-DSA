class Solution {
    public int missingNumber(int[] nums) {

        int currSum = 0;
        int actualSum = 0;

        for(int i = 0; i <= nums.length; i++){
            actualSum = actualSum + i;
        }

        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
        }

        int ans = actualSum - currSum;

        return ans;
        
    }
}