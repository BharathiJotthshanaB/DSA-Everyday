class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        if(s==null || s.length()==0 || k==0) return -1;
        Map<Character,Integer> window = new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=-1;
        while(right<s.length()){
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            right++;
            while(window.size()>k){
                char d = s.charAt(left);
                window.put(d,window.get(d)-1);
                if(window.get(d)==0){
                    window.remove(d);
                }
                left++;
                
            }
            maxlen = Math.max(maxlen,right-left);
            
        }
        return maxlen;
    }
}