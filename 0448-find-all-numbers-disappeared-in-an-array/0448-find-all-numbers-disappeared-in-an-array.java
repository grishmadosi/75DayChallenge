class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int a: nums) set.add(a);
        int n = nums.length;
        while(n > 0){
            if(!set.contains(n)) list.add(n);
            n--;
        }
        return list;
    }
}