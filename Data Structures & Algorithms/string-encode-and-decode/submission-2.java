class Solution {

    public String encode(List<String> strs) {
         StringBuilder encoded_string = new StringBuilder();

        for (String s : strs){
            encoded_string.append(s.length()).append('#').append(s);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();
        
        StringBuilder word = new StringBuilder();
              
        int index = 0;
        int word_size = 0;
        while (index < str.length() - 1) {
        	int strt_indx = index;
        	char c = str.charAt(index++);
        	while ((c = str.charAt(index++)) != '#');
        	int end_indx = index - 1;
        	word_size = Integer.parseInt(str.substring(strt_indx, end_indx));
        	for (int i = 0; i < word_size; i++, index++) {
        		c = str.charAt(index);
        		word.append(c);
        	}
        	decoded_string.add(word.toString());
        	word.delete(0,  word.capacity());
        	word_size = 0;
        }
        return decoded_string;
    }
}
