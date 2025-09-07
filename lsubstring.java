class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int left =0;
       int maxlen = 0;
       Map <Character,Integer> map = new HashMap<>();
       for(int right =0 ;right<n ;right++){
        char c = s.charAt(right);
        if(map.containsKey(c)&& map.get(c)>=left){
            left = map.get(c)+1;
        }
        map.put(c,right);
        maxlen = Math.max(maxlen,right-left+1);
       }
       return maxlen;
    }
}