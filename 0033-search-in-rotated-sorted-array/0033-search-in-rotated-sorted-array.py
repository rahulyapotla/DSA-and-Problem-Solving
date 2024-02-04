class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        high = n-1
        low = 0
        while(low <= high):
            mid = low + (high-low) // 2
            if(target == nums[mid]):
                return mid
            elif(nums[low] <= nums[mid]):
                if(target >= nums[low] and target <= nums[mid]):
                    high = mid-1
                else:
                    low = mid +1
            elif(nums[mid] <= nums[high]):
                if(target >= nums[mid] and target <= nums[high]):
                    low = mid + 1
                else:
                    high = mid - 1
        return -1