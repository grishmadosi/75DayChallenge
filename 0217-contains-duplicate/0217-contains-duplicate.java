class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;
        Arrays.sort(nums);
        int i = 0, k = 1;
        while(k < nums.length){
            if(nums[i] == nums[k]){
                return true;
            }
            i++;
            k++;
        }
        return false;
    }
}