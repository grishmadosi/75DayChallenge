class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(c);
        return cSum(c,target,0,0,outer,new ArrayList<>());
    }
    public List<List<Integer>> cSum(int[] c, int target, int idx,int sum, List<List<Integer>> outer, List<Integer> internal){
        if(sum == target){
            outer.add(new ArrayList<>(internal));
            return outer;
        }

        for(int i = idx; i < c.length; i++){
            if(i > idx && c[i] == c[i-1]) continue;
            if(sum + c[i] <= target){
                internal.add(c[i]);
                cSum(c,target,i+1,sum+c[i],outer, internal);
                internal.remove(internal.size()-1);
            }
        }
        return outer;
    }
}