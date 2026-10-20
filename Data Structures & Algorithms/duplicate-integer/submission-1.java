class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            if (!set.contains(num)){
                set.add(num);
            }
            else{
                return true;
            }
        }
        return false;
    }
}