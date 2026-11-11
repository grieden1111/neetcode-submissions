class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
		
		for (int n : nums) {
			set.add(n);
		}
		
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			if (!set.contains(start - 1)) {
				int counter = 0;
				while (set.contains(start++)) {counter++;}
				if (counter > max) max = counter;
			}
		}

		return max;
	}
}

/* fist attmempt; htink i copied solution
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
*/
