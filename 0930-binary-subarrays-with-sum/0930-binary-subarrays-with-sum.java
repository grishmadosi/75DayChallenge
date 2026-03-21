class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0, count = 0;
        while(i < nums.length){
            int j = i;
            int sum = 0;
            while(j < nums.length){
                 sum += nums[j];
                 if(sum == goal){
                    count++;
                 }else if(sum > goal){
                    break;
                 }
                 j++;
            } 
            i++;
        }
        return count;
    }
}