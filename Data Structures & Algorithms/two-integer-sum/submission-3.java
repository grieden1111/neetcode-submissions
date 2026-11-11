class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        Hashtable<Integer, Integer> ht = new Hashtable<>();        
        int y;
        int [] rt = new int[2];
        for (int i = 0; i < nums.length; i++){
            y = target - nums[i];
            if (ht.containsKey(y)) { 
                rt[0] = ht.get(y);
                rt[1] = i;
            }
            ht.put(nums[i], i);
        }
        return rt;
    }
    */
    //Reattempting to gain giga brain
    HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int key = target - nums[i];
			if (map.containsKey(key)) {
				return new int[]{map.get(key), i};
				}
			else map.put(nums[i], i);
		}
		
		return new int[] {-1,-1};
    }

    
}
