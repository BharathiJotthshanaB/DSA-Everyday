class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right =0;
        int maxcount =0;
        int result =0;
        int [] count = new int[26];
        while(right<s.length()){
            char c = s.charAt(right);
            count[c-'A']++;
             maxcount = Math.max(maxcount,count[c-'A']);
            right++;
           
            while((right-left)-maxcount>k){
                char d = s.charAt(left);
                count[d-'A']--;
                left++;
            }
            result = Math.max(result,right-left);
        }
        return result;
    }
}