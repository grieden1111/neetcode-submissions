class Solution {
    public int[] productExceptSelf(int[] nums) {


		int size = nums.length;
		int [] prefix = new int[size];
		
		prefix[0] = nums[0];
		for (int i = 1; i < size; i++) {
			prefix[i] = prefix[i-1] * nums[i];
		}
		
		int [] output = new int[size];
		int postfix_product = 1;
		for (int i = size - 1; i > 0; i--) {
			output[i] = postfix_product * prefix[i - 1];
			postfix_product *= nums[i];
		}
		output[0] = postfix_product;
		return output;
    }
}

/* first attempt, definitely copied solution
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
*/
