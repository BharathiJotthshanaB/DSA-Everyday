class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> Set = new HashSet<>();
        for(int num:arr){
            int complement = target-num;
            if(Set.contains(complement)){
                return true;
            }
            Set.add(num);
        }
        return false;
    }
}