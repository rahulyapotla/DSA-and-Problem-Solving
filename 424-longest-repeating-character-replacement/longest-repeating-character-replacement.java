class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        int[] count = new int[26];
        while(r<s.length()){
            count[s.charAt(r)-'A']++;
            maxFrequency = Math.max(maxFrequency, count[s.charAt(r)-'A']);
            if((r-l+1) - maxFrequency > k) {
                count[s.charAt(l) - 'A']--;
                maxFrequency = 0;
                l += 1;
            }
            if((r-l+1) - maxFrequency <= k) 
                maxLength = Math.max(maxLength, r-l+1);
            r++;
        }
        return maxLength;
    }
}