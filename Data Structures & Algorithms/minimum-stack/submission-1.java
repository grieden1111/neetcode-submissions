class MinStack {

    Stack<Integer> MinStack;
	Stack<Integer> MinTracker;
	int min;

    public MinStack() {
        MinStack = new Stack<>();
		MinTracker = new Stack<>();        
    }
    
    public void push(int val) {
        if (MinStack.isEmpty()) {
    		min = val;
    		MinStack.push(val);
    		MinTracker.push(val);
    	} else {
    		if (val < min) {
    			min = val;
    			MinTracker.push(val);
    		}else {
    			MinTracker.push(min);
    		}
    		MinStack.push(val);
    	}
        
    }
    
    public void pop() {
        MinStack.pop();
        MinTracker.pop();
        min = getMin();
        
    }
    
    public int top() {
        if (!MinStack.isEmpty()) {
        	return MinStack.peek();
        } 
        return -1;
    }
    
    public int getMin() {
        if (!MinTracker.isEmpty()) {
        	return MinTracker.peek();
        } 
        return -1;
    	
    }
}
