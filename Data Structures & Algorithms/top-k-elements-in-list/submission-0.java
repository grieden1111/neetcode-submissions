class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] output = new int[k];
        List<Integer>[] freq = new List[nums.length + 1];
        Map<Integer, Integer> val = new HashMap<>();
        //counts the # of elements
        for (int i = 0; i < nums.length; i++){
            if (!val.containsKey(nums[i])){
                val.put(nums[i], 1);
            }
            else{
                val.put(nums[i], val.get(nums[i]) + 1);
            }
        }

        //create a new array for each bucket in freq
        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        //populate the buckets with the counts from the map
        for (Map.Entry<Integer, Integer> entry : val.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        //start at the back of the array of arrays (since the highest counts will be located at the back/end)
        for (int i = freq.length - 1; i > 0 && index < k; i--){
            //for each number in this bucket (freq[i]), add to the output.
            for (int n : freq[i]){
                output[index++] = n;
                //if the number just added was the last one to reach k, just return the output array.
                if (index == k){
                    return output;
                }
            }
        }
        return output;
    }
}
