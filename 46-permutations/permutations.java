class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        computePermutation(0, nums, ans);
        return ans;
    }

    public void computePermutation(int index, int[] nums, List<List<Integer>> ans) {
        int n=nums.length;
        List<Integer> temp = new ArrayList<>();
        if(index == n) {
            for(int i=0;i<n;i++) {
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++) {
            swap(i, index, nums);
            computePermutation(index+1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}