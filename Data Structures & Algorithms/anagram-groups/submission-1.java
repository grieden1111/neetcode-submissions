class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> anagrams = new HashMap<>();
		
		for (String s : strs) {
			HashMap<Character, Integer>	alphabet = new HashMap<>();
			char c;
			for (int i = 0; i < s.length(); i++) {
				if (alphabet.containsKey(c = s.charAt(i))) {
					int value = alphabet.get(c);
					alphabet.replace(c, ++value);
				} else {alphabet.put(c, 1); }
				
			}
			if (anagrams.containsKey(alphabet)) {
				anagrams.get(alphabet).add(s);
			} else {
				anagrams.put(alphabet, new ArrayList<>());
				anagrams.get(alphabet).add(s);
			}
			
		}
		
		//print out all the goodies!!
		List<List<String>> output = new ArrayList<List<String>>();
		for (Map.Entry<HashMap<Character, Integer>, List<String>> entry : anagrams.entrySet()) {
			output.add(entry.getValue());
		}
		
		return output;            
        }
    
}
