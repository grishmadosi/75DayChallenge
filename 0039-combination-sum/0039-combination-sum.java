class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
         return combSum(candidates, target,0, 0, outer, new ArrayList<>());
          
    }
    public List<List<Integer>> combSum(int[] c, int target,int idx,int sum, List<List<Integer>> outer, List<Integer> internal){
        if(sum == target){
            outer.add(new ArrayList<>(internal));
            return outer;
        }
        

        for(int i = idx; i < c.length; i++){
             if(i > idx && c[i] == c[i-1]) continue;
             if(sum + c[i] <= target){
                internal.add(c[i]);
                combSum(c,target,i,sum+c[i],outer,internal);
                internal.remove(internal.size()-1);
             }
                
        }
        return outer;
    }
}