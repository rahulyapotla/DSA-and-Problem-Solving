class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=0
        j=0
        length = len(nums)
        while(i<length):
            if(nums[i]!=0):
                nums[j]=nums[i]
                i+=1
                j+=1
            else:
                i+=1;
        while(j<length):
            nums[j]=0
            j+=1
        return nums
                
        