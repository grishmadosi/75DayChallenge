class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 12) return new ArrayList<>();
        return solve(s,0,0,"",new ArrayList<>());
    }
    public List<String> solve(String s, int idx, int part, String curr, List<String> internal){
        if(idx == s.length() && part == 4){
            internal.add(curr.substring(0,curr.length()-1));
            return internal;
        }

        if(idx+1 <= s.length()){
            solve(s, idx+1,part+1,curr+s.substring(idx,idx+1)+".",internal);
        }
        if(idx+2 <= s.length() && isValid(s.substring(idx,idx+2))){
            solve(s, idx+2, part+1, curr+s.substring(idx,idx+2)+".",internal);
        }
        if(idx+3 <= s.length() && isValid(s.substring(idx,idx+3))){
            solve(s, idx+3, part+1, curr+s.substring(idx,idx+3)+".",internal);
        }
        return internal;
    }
    public boolean isValid(String s){
        if(s.charAt(0) == '0') return false;
        int n = Integer.valueOf(s);
        if(n < 0 || n >255) return false;
        return true;
    }
}