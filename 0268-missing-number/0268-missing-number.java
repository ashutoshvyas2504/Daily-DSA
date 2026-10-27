class Solution {
    public int missingNumber(int[] nums) {
        
        int actualSum = 0;
        int currSum = 0;

        int n = nums.length;

        for(int i = 0; i <= n; i++){
             currSum = currSum + i;
        }

        for(int i = 0; i < n; i++){
            actualSum = actualSum + nums[i];
        }

        int ans =  currSum - actualSum;

        return ans;
    }
}