class Solution {
    public List<String> generateParenthesis(int n) {
        return para("",n,n,n,new ArrayList<>());
    }
    public List<String> para(String p, int r, int l,int n,List<String> list){
        if(p.length() == n*2){
            if(isValid(p)) list.add(p);
            return list;
        }
        if(r > 0){
            para(p+'(',r-1,l,n,list);
        }
        if(l > 0){
            para(p+')',r,l-1,n,list);
        }
        return list;
    }
    public boolean isValid(String p){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < p.length(); i++){
            if(p.charAt(i) == '(') st.push(p.charAt(i));
            else{
                if(st.isEmpty()) return false;
                else if(st.peek() == '(') st.pop();
                else return false;
            }
            
        }
        return true;
    }
}