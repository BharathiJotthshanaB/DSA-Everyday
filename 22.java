class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map <Character,Integer> need = new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0;
        int right =0;
        int valid = 0;
        Map <Character,Integer> window = new HashMap<>();

        int start =0, minlen =Integer.MAX_VALUE; 
        while(right<s.length()){
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(need.get(c).intValue()==window.get(c).intValue()){
                    valid++;
                }
            }
            while(valid==need.size()){
                if(right-left<minlen){
                    start= left;
                    minlen = right-left;
                }
                char d = s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).intValue()==need.get(d).intValue()){
                        valid--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return minlen == Integer.MAX_VALUE ?"":s.substring(start,start+minlen);
    }
}