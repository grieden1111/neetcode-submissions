class Solution {
    public boolean isPalindrome(String s) {
        int frontP = 0;
		int backP = s.length() - 1;
		
		while (frontP < backP) {
			char frontC = s.charAt(frontP);
			while (frontP < backP && !Character.isDigit(frontC) && !Character.isAlphabetic(frontC)) {
				frontC = s.charAt(++frontP);
			}
			char backC = s.charAt(backP);
			while (backP > frontP && !Character.isDigit(backC) && !Character.isAlphabetic(backC)) {
				backC = s.charAt(--backP);
			}
			if (!Character.isDigit(frontC)) frontC = Character.toLowerCase(frontC);
			if (!Character.isDigit(backC)) backC = Character.toLowerCase(backC);
			
			if (frontC != backC) return false;
			frontP++;
			backP--;
		}
		return true;
    }
}
