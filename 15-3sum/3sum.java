class Solution {
    // first sort the array and start collecting three number susing three pointers, keepingon epointer constant and using the oter ttwo to determine the sum. Since the array is sorted, you can move the pointers accoding to the sum value and also check for the duplicates before calculating the sum
    // TC: O(NlogN) - for sorting annd kinda O(N2) - looping n times for each i
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(i != 0 && nums[i] == nums[i-1])
            continue;
            int j=i+1;
            int k=n-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}