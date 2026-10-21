class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] l = new List[nums.length + 1];
        Map<Integer, Integer> ht = new HashMap<>();

        for (int i = 0; i < l.length; i++) l[i] = new ArrayList<>();
        
        
        for (int n : nums) ht.put(n, ht.getOrDefault(n, 0) + 1);
        

        for (Map.Entry<Integer, Integer> entry : ht.entrySet())l[entry.getValue()].add(entry.getKey());

        int numsLeft = k;
        int [] kFrequent = new int [k];
        for (int i = l.length - 1; i > 0 && numsLeft > 0; i--){
            for (int j : l[i]) kFrequent[--numsLeft] = j;
            
        }

        return kFrequent;
    }   
}
