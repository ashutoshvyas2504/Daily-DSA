class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // first reverse the whole array [7,6,5,4,3,2,1]
        reverse(nums, 0, n - 1);
        // then reverse the first k elements [5,6,7,4,3,2,1]
        reverse(nums, 0, k - 1);
        // then reverse the remaining elements [5,6,7,1,2,3,4]
        reverse(nums, k, n - 1);

    }

    public void reverse(int[] nums, int start, int end) {

        // reversing elements using 2 pointer   
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}