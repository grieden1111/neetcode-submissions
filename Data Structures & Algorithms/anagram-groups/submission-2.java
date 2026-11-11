class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
	HashMap<String, List<String>> anagrams = new HashMap<>();
		
		for (String s : strs) {
			int [] alphabet = new int[26];
			char c;
			for (int i = 0; i < s.length(); i++) {
				alphabet[(c = s.charAt(i)) - 97]++;
			}
			String key = Arrays.toString(alphabet);
			if (anagrams.containsKey(key)) {
				anagrams.get(key).add(s);
			} else {
				List<String> list = new ArrayList<>();
				list.add(s);
				anagrams.put(key, list);
			}
		}
		List<List<String>> output = new ArrayList<List<String>>();
		for (Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
			output.add(entry.getValue());
		}
		
		return output;

	}
}
