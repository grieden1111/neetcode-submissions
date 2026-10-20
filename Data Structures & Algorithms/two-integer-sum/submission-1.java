class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int [] a = new int [2];
        table.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++){
            int num = target - nums[i];
            if (table.containsKey(num)){
                a[1] = i;
                a[0] = table.get(num);
                
            }
            table.put(nums[i], i);
        }
        return a;
    }
}
     
