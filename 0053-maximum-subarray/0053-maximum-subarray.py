class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        subsum = nums[0]
        ans = nums[0]
        for i in range(1, len(nums)):
            subsum = max(nums[i], nums[i]+subsum)
            if subsum > ans:
                ans = subsum
            
        return ans
            
        