class Solution {
    public int maxArea(int[] heights) {
       	int length = heights.length;
		
		int l = 0;
		int r = length - 1;
		int max = 0;
		while (l < r) {
			int lH = heights[l];
			int rH = heights[r];
			int area = Math.min(lH, rH) * (r - l);
			if (max < area) max = area;
			if (lH <= rH) l++;
			else r--;
		
		}
		
		return max; 
    }
}
