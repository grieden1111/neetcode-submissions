class Solution {
    /*
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < nums.length; i++){
            if (ht.containsKey(nums[i])) return true;
            ht.put(nums[i], i);
        }
        return false;
    }
    */

    //second attempt, revisiting problems
    public boolean hasDuplicate(int[]nums){
    HashSet<Integer> set = new HashSet<>();
		
		for (int n : nums) {
			if (!set.contains(n)) {
				set.add(n);
			} else return true;
		}
		
		return false;
    }
}