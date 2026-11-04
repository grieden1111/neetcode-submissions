class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
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
}
