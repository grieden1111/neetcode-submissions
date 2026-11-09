class Solution {
    public int trap(int[] height) {
        int length = height.length;
		int[] Lmax = new int[length];
		int[] Rmax = new int[length]; 
		int[] min = new int[length];
		
		// can skip first index cause will always be zero (new array initialized with 0)
		for (int i = 1; i < length; i++) {
			Lmax[i] = (Lmax[i-1] > height[i-1]) ? Lmax[i-1] : height[i-1];
			
		}
		// can skip last index cause will always be zero (new array initialized with 0)
		for (int i = length - 2; i > 0; i--) {
			Rmax[i] = (Rmax[i+1] > height[i+1]) ? Rmax[i+1] : height[i+1];
		}
		
		int trappedWater = 0;
		for (int i = 0; i < length; i++) {
			min[i] = Math.min(Lmax[i], Rmax[i]) - height[i];
			if (min[i] > 0) trappedWater += min[i];
		}
		return trappedWater;
    }
}
