class Solution {
    public boolean isValid(String s) {
	//second attempt
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ')' || c == '}' || c ==']') {
				
				if (stack.isEmpty()) return false;
				
				char p = stack.pop();
				switch (p) {
					case '(': if (c != ')') return false; break;
					case '{': if (c != '}') return false; break;
					case '[': if (c != ']') return false; break;
				}
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}

        /*
        Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			}
            else {
                if (stack.isEmpty()) return false;
				switch(c) {
				case ']': if (stack.pop() != '[') return false; break;
				
				case '}': if (stack.pop() != '{') return false; break;
				
				case ')': if (stack.pop() != '(') return false; break;
				}
		
				}
			}
		return stack.isEmpty();
	}
    */
}
