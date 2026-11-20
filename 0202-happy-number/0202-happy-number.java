class Solution {
    public boolean isHappy(int n) {
        // using Recursion

        //base Case
        if(n == 1){
            return true;
        }

        if(n == 4){
            return false;
        }
        
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }

       boolean ans = isHappy(sum);

        return ans;
    }
}