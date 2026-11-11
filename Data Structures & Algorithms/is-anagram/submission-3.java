class Solution {
    public boolean isAnagram(String s, String t) {
        		
		if (s.length() != t.length() || s.isBlank() || t.isBlank()) return false;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char c;
		char l;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(c = s.charAt(i))) {
				int value = map.get(c);
				map.replace(c, ++value);
			} else map.put(c, 1);
			
			if (map.containsKey(l = t.charAt(i))) {
				int value = map.get(l);
				map.replace(l, --value);
			} else map.put(l, -1);
		}
		
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) return false;
		}
		return true;
	
    }
}
