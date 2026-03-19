class Solution {

    //Process
    //first find the dip, if no dip then just reverse
    //swap the just largest number with the dip, find the largest from the end;
    //reverse it after the dip till the end
    public void nextPermutation(int[] nums) {
        int idx = 0;
        int flag = 0;
        for(int i = nums.length -1; i > 0 ; i--){
            if(nums[i] > nums[i-1]){
                idx = i-1;
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            int a = 0;
            int b = nums.length -1;
            while(a <= b){
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b--;
            }
            return;
        }
        int ix = 0;
        for(int i  = nums.length-1; i >= idx+1; i--){
            if(nums[idx] < nums[i]){
                ix = i;
                break;
            }
        }
        int temp = nums[idx];
        nums[idx] = nums[ix];
        nums[ix] = temp;

        int a = idx+1;
        int b = nums.length-1;
        while(a <= b){
               temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b--;
        }
    }
}