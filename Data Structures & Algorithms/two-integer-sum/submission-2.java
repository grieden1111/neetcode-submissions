class Solution {
    public int[] twoSum(int[] nums, int target) {
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
}
