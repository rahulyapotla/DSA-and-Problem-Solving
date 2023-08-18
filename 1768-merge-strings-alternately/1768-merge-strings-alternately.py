class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        length = len(word1)+len(word2)
        final = ""
        for i in range(0,length):
            if i < len(word1) :
                final+=word1[i]
            if i < len(word2):
                final+=word2[i]
        return final
            
        