class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans = Integer.MAX_VALUE;
        while(l<=h) {
            int mid = (l+h)/2;
            if(nums[l] <= nums[h]) {
                ans = Math.min(nums[l], ans);
                return ans;
            }
            else if(nums[l] <= nums[mid]) {
                ans = Math.min(nums[l], ans);
                l = mid +1;
            } else if(nums[mid] <= nums[h]){
                ans = Math.min(ans, nums[mid]);
                h = mid-1;
            }
        }
        return ans;
    }
}