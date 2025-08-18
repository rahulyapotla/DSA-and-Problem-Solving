class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || s.length() < t.length()) return "";

        int[] need = new int[256];
        for (char c : t.toCharArray()) need[c]++;

        int left = 0, haveCount = 0;
        int bestStart = -1, bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);

            if (need[rc] > 0) {   // Was still needed?
                haveCount++;
            }
            need[rc]--;           // Take it into the window

            while (haveCount == t.length()) {
                int winLen = right - left + 1;
                if (winLen < bestLen) {
                    bestLen = winLen;
                    bestStart = left;
                }

                char lc = s.charAt(left);
                need[lc]++;       // Give back the left char
                if (need[lc] > 0) {
                    haveCount--;  // We removed a required char
                }
                left++;
            }
        }
        return bestStart == -1 ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}