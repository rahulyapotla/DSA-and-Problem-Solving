class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        temp=[]
        maxC = max(candies)
        for i in candies:
            if(i+extraCandies >= maxC):
                temp.append(True)
            else:
                temp.append(False)
        return temp
                