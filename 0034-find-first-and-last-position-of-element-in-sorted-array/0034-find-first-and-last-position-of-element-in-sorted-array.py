class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        def findOccurence(nums, target, key: ""):
            low=0
            high = len(nums) - 1
           
            result = -1
            while (low <= high):
                mid = low + (high-low) // 2
                if target == nums[mid]:
                    result = mid
                    if(key == "first"):
                        high = mid-1
                    else:
                        low=mid+1
                elif target < nums[mid]:
                    high = mid-1
                else:
                    low = mid+1
            return result
        first = findOccurence(nums, target, "first")
        last = findOccurence(nums, target, "last")
        return [first, last]
        
