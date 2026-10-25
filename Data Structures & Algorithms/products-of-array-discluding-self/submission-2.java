class Solution {
    public int[] productExceptSelf(int[] nums) {
		int array_length = nums.length;
		int [] output = new int [array_length];
		int running_product_prefix = 1;
		
		for (int i = 0; i < array_length; i++) {
			output[i] = running_product_prefix;
			running_product_prefix *= nums[i];
		}
		
		int running_product_postfix = 1;
		for (int i  = array_length - 1; i > -1; i--) {
			output[i] = running_product_postfix * output[i];
			running_product_postfix *= nums[i];
		}
		return output;
    }
}  
