class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        reverse = words[::-1]
        rev_string=' '.join(reverse)
        return rev_string