class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seqLen = 0;
        numSet = set(nums)
        for n in nums:
            
            if(n-1) not in numSet:
                length = 1
                while(n + length) in numSet:
                    length += 1
                seqLen = max(length, seqLen)
        return seqLen