class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i = 0, j = 0, t = k;
       double avg = 0, max = Integer.MIN_VALUE;
       int sum = 0;
       while(t > 0){
         sum += nums[j];
         t--;
         j++;
       } 
       while(j < nums.length){
          avg =(double)sum/k;
          max = Math.max(max,avg);
          sum += nums[j];
          sum = sum - nums[i];
          i++;
          j++;
       }
       avg = (double)sum/k;
       max = Math.max(max,avg);
       return max;
    }
}