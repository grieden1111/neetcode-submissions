class Solution {
    public int search(int[] nums, int target) {
        
        //if (nums.length == 1 && nums[0] == target) return 0;

   		int l = 0;
		int r = nums.length;
		int resultIndx = -1;
		
		while (l < r) {
			int ind = (l + r) / 2;
			if (nums[ind] > target) r = ind;
			else if (nums[ind] < target) l = ind + 1;
			else {resultIndx = ind; break;}
		}
		return resultIndx;
    }
}
