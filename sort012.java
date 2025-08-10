class Solution {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int hi = arr.length-1;
        
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
                               
              }
              else if(arr[mid]==1){
                  mid++;
                  
              }
              else{
                  int temp = arr[mid];
                  arr[mid] = arr[hi];
                  arr[hi--] = temp ;
              }
        }
    }
}