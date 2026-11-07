class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		
		//for loops will act as pointers
		
		Arrays.sort(nums);
		int length = nums.length;
				
		for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
			int l = i + 1;
			int r = length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum > 0) --r;
				else if (sum < 0) ++l;
				else {
					output.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
					while (l < r && nums[l] == nums[l - 1]) l++;
				}
			}
			
		}
		return output;
		
	}
}
