class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        pa = [1] * length
        sa = [1] * length
        fa = [0] * length

        pp = 1
        for i in range(1, length):
            pp *= nums[i - 1]
            pa[i] = pp

        sp = 1
        for i in range(length - 2, -1, -1):
            sp *= nums[i + 1]
            sa[i] = sp

        for i in range(length):
            fa[i] = pa[i] * sa[i]

        return fa

