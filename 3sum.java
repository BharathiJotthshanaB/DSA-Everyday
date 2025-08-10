class Solution {
    public static boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left = i+1;
            int right= arr.length-1;
            while(left<right){
            int sum = arr[i]+arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
        }}
        return false;
    }
}
