class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int a: nums){
        map.put(a,map.getOrDefault(a,0)+1);
       }
       int[] arr = new int[k];
       int j = 0;
       while(k > 0){
           int max = Integer.MIN_VALUE;
           int key = 0;
          for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        
            if(entry.getValue() > max){
                max = entry.getValue();
                key = entry.getKey();
            }
          }
          arr[j] = key;
          j++;
          k--;
          map.remove(key);
       }
       return arr;
    }
}