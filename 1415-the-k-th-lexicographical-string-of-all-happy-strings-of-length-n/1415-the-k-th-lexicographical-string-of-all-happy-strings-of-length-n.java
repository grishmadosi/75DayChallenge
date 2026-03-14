class Solution {
    public String getHappyString(int n, int k) {
        char[] arr = {'a', 'b', 'c'};
        List<String> list = happy(n, arr, 0, "", new ArrayList<>());
        if(k-1 < list.size())
        return list.get(k-1);
       return "";
    }
    public List<String> happy(int n, char[] arr, int idx, String p, List<String> list){
        if(p.length() == n){
            list.add(p);
            return list;
        }
        for(int i = 0; i < arr.length; i++){
           if(p.length() > 0 && p.charAt(p.length() - 1) == arr[i]) continue; 
           happy(n, arr, i + 1, p + arr[i] , list);
        }
        return list;
    }
}