class Solution{
    int missingNum(int[]arr){
        int n = arr.length+1;
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0;i<arr.length;i++){
            xor1^=arr[i];
            
        }
        for(int i=0;i<=n;i++){
            xor2^=i;
        }
        return xor1^xor2;
    }
}