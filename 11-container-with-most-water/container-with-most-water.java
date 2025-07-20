class Solution {
    public int maxArea(int[] heights) {
         int i = 0;
        int n = heights.length;
        int j=n-1;
        int area = 0;
        while(i<j) {
            int res = Math.min(heights[i], heights[j]) * (j-i);
            area = Math.max(res, area);
            if(heights[i] <= heights[j])
            i++;
            else
            j--;
        }
        return area;
    }
}