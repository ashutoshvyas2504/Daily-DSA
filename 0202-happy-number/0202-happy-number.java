class Solution {
    // Recursively
   public int sumOfSquare(int n){
       if(n==0){
        return 0;
       }
     int digit = n % 10;

     return digit * digit + sumOfSquare(n / 10);

   }

    public boolean isHappy(int n) {
      if(n==1){
        return true;
      }

      if(n==4){
        return false;
      }

      return isHappy(sumOfSquare(n));
    }
}