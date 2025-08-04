class Solution {
    // to check for duplicates, we use map and everytime we check for longest substring, keep incrementing the length if the ele doesn't exist in the hashmap and if it exists then move the left pointer to just the next element after the existing element
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> mpp = new HashMap<>();
    
        
        while(r<n) {
            if(mpp.containsKey(s.charAt(r))) {
                l = Math.max(mpp.get(s.charAt(r))+1, l);
            } 
                mpp.put(s.charAt(r), r);
                maxLen = Math.max(maxLen, r-l+1);
                r++;
        }
        return maxLen;
    }
}