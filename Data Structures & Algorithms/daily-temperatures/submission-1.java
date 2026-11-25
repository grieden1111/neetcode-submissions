class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //second attempt
        int index;
		int [] output = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < temperatures.length; i++) {
			int temp = temperatures[i];
			while (!stack.isEmpty() && temp > temperatures[(index = stack.peek())]) {
				int nDays = i - index;
				stack.pop();
				output[index] = nDays;
			}
			
			stack.push(i);
		}
		return output;
	}
	

        /*
        Stack<Integer> stack = new Stack<>();
    	int length = temperatures.length;
    	int prev = temperatures[0];
    	stack.push(0);
    	for (int i = 1; i < length; i++) {
    		int cur = temperatures[i];
	    	while (cur > prev) {
	    		int prevInd = stack.pop();
	    		temperatures[prevInd] = i - prevInd;
	    		if (!stack.isEmpty()) {
	    			prev = temperatures[stack.peek()];
	    		} else {
	    			break;
	    		}
	    	}
	    	stack.push(i);
	    	prev = temperatures[i];
    	}
    	while (!stack.isEmpty()) {
    		int ind = stack.pop();
    		temperatures[ind] = 0;
    	}
    	return temperatures;
    }
    */
}
