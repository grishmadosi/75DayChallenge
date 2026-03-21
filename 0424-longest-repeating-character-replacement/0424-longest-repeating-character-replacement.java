class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, ans = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            max = Math.max(max,map.get(s.charAt(i)));
            while((i-j+1)-max > k){
               map.put(s.charAt(j), map.get(s.charAt(j))-1);
               j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}