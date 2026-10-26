class Solution {
    public int longestConsecutive(int[] nums) {
        
    	HashSet<Integer> hs = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		
		int longest = 0;
		//for (int j = 0; j < nums.length; j++) {
        for (int num : hs){
			int start = num;
			int counter = 0;
			if (!hs.contains(--start)) {
				while (hs.contains(++start)) counter++;
			}
			if (counter >= longest) longest = counter;
		}
		
		return longest;
		
	}
}
