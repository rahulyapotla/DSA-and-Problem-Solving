class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if len(stones) == 0:
            return 0
        stones = [-stone for stone in stones]
        heapq.heapify(stones)
        while len(stones) >1:
            s1 = heapq.heappop(stones)
            s2 = heapq.heappop(stones)
            if s1 != s2:
                heapq.heappush(stones, s1-s2)
        if len(stones) == 0:
            return 0
        return -stones[0]