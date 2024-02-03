class Solution:
    def findMin(self, nums: List[int]) -> int:
        low = 0
        high = len(nums)-1
        while(low<=high):
            mid = low + (high-low) // 2
            nextE  = mid+1 
            prev = mid-1 
            if (nums[low] <= nums[high]):
                return nums[low]
            elif(nums[mid] <= nums[nextE] and nums[mid] <= nums[prev]):
                return nums[mid]
            elif(nums[mid] <= nums[high]):
                high = mid-1
            elif(nums[mid] >= nums[low]):
                low = mid+1
        
                
            
            
        