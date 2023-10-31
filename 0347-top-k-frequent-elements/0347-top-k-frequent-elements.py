class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}
        for i in nums:
            map[i] = 1 + map.get(i, 0)
        freq = [[] for i in range(len(nums) + 1)]
        for i, n in map.items():
            freq[n].append(i)
        arr = []
        for i in range(len(freq)-1, 0, -1):
            for n in freq[i]:
                arr.append(n)
            if k == len(arr):
                return arr
            
                
                
