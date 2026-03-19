class Solution {
    public int longestConsecutive(int[] nums) {
        //if(nums.length == 1) return 1;
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }
        int[] arr = new int[set.size()];
        int j = 0;
        for(int a: set){
            arr[j] = a;
            j++;
        }
        Arrays.sort(arr);
        int count = 1, max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == 1){
                count++;
            }else{
                count = 1;
            }
           max = Math.max(count, max);
        }
        if(arr.length == 1) return 1;
        return max;
    }
}