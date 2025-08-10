class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length!=b.length){
            return false;
            
        }
        HashMap <Integer,Integer> freq = new HashMap<>();
        for(int num:a){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(!freq.containsKey(num)||freq.get(num)==0){
                return false;
            }
            freq.put(num ,freq.get(num)-1);
        }
        return true;
    }
}