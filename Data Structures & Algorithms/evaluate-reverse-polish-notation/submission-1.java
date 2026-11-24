class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
		
		for (String s : tokens) {
			int second;
			switch (s){
				case "+" -> { 
					second = stack.pop();
					stack.push(stack.pop() + second);
				}
				case "-" -> {
					second = stack.pop();
					stack.push(stack.pop() - second);
				}
				case "/" -> {
					second = stack.pop();
					stack.push(stack.pop() / second);
				}
				case "*" -> {
					second = stack.pop();
					stack.push(stack.pop() * second);	
				}
				default -> stack.push(Integer.parseInt(s));
			}
		}
		return stack.pop();
	}
        /*
        
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
    */
}
