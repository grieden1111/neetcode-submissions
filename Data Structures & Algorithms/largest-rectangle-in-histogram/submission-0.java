class Solution {
    public int largestRectangleArea(int[] heights) {
    	int length = heights.length;
		int max_area = 0;
		Stack<int[]> stack = new Stack<>();
		for (int i = 0; i < length; i++) {
			int start = i;
			//keep popping and calculating area while the current height is smaller than the stack's current height.
			while (!stack.isEmpty() && heights[i] < stack.peek()[1]) {
				int [] pair = stack.pop();
				max_area = getMaxArea(pair, max_area, i);
				start = pair[0];//we are adding heights to the stack from left to right monotonically increasing. Therefore,
								//when we encounter a smaller height than the stack's top, we are popping the stack's top till
								//we reach a height that is smaller than the current height we are comparing. Therefore, we can't
								//lose the area that the current height could extend to the left (we just popped all of the stack that
								//the current height could extend to. So thats why we update the index, as that functions as the 
								//width to the left.
								
			}
			stack.push(new int[]{start, heights[i]});
		}
		//Now, only items left in the stack are increasing in order.
		while (!stack.isEmpty()) {
			int[] popPair = stack.pop();
			int index = popPair[0];
			int height = popPair[1];
			int popArea = (length - index) * height;
			if (popArea>max_area) max_area = popArea;
		}
		
		return max_area;
	}
	
	public static int getMaxArea(int[] pair, int max_area, int bound) {
		int index = pair[0];
		int height = pair[1];
		int popArea = (bound - index) * height;
		return (popArea > max_area) ? popArea : max_area;
	}
}
