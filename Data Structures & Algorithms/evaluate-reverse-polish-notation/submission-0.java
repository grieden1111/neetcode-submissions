class Solution {
    public int evalRPN(String[] tokens) {
        		Stack<Integer> stack = new Stack<>();
		
		int length = tokens.length;
		
		int first;
		
		int second;
		
		for (int i = 0; i < length; i++) {
			String c = tokens[i];
			switch(c) {
			case "+": second = stack.pop(); first = stack.pop(); stack.push(first + second); break;
			
			case "-": second = stack.pop(); first = stack.pop(); stack.push(first - second); break;
			
			case "/": second = stack.pop(); first = stack.pop(); stack.push(first / second); break;
			
			case "*": second = stack.pop(); first = stack.pop(); stack.push(first * second); break;
			
			default: stack.push(Integer.parseInt(c));
			}
	
			
		}
		return stack.pop();
    }
}
