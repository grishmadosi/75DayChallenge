class Solution {
    public String decodeString(String s) {
      Stack<Integer> st1 = new Stack<>();
      Stack<String> st2 = new Stack<>();
      String fs = new String();
      int i = 0;
      while(i < s.length()){
        char ch = s.charAt(i);
        StringBuilder ns = new StringBuilder();
        if(Character.isDigit(ch)){
             int sum = 0;
           while(Character.isDigit(s.charAt(i))){
             sum = sum*10 + s.charAt(i)-'0';
             i++;
           }
           st1.push(sum);
        }else if(ch == ']'){
           while(!st2.peek().equals("[")){
              ns.insert(0,st2.pop());
           }
           st2.pop();
           int n = st1.pop();
           fs = ns.toString();
           StringBuilder sb = new StringBuilder();//new stringBuilder required here
           while(n > 0){
            sb.append(fs);
            n--;
           }
           fs = sb.toString();
           st2.push(fs);
           i++;
        }else{
            st2.push(ch+"");
            i++;
        }  
      }
      StringBuilder ns = new StringBuilder();
      while(!st2.isEmpty()){
        ns.insert(0,st2.pop());
      }
      return ns.toString();
    }
}