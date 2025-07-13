class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
                arr[n-1] = -1;

        for(int i = n-2;i>=0;i--) {
            if(arr[i] > max) {
              int t= max;
                max=arr[i];
                arr[i] = t;
                
            } else {
                arr[i]=max;
            }
            
        }
        return arr;
    }
}