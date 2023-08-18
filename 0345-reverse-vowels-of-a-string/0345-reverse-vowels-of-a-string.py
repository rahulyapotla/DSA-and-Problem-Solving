class Solution:
    def reverseVowels(self, s: str) -> str:
        v = ['a','e','i','o','u', 'A', 'E', 'I','O','U']
        i=0
        j=len(s)-1
        s_list = list(s)
        while(i<j):
            if(s[i] in v and s[j] in v):
                s_list[i], s_list[j] = s_list[j], s_list[i]
                i+=1
                j-=1
            elif(s[i] in v and s[j] not in v):
                j-=1
            elif(s[j] in v and s[i] not in v):
                i+=1
            else:
                i+=1
                j-=1
        return ''.join(s_list)
        