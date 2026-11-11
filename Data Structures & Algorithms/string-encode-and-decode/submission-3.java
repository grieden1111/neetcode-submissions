class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded_string = new StringBuilder();
    	
    	// '#' is the delimiter, and the length shows how far ahead we need to go to capture
    	// the entire word. then append word after
    	for (String s : strs) {
    		encoded_string.append(s.length() + "#" + s);
    	}
    	
    	return encoded_string.toString();

        //first attempt
        /*
        StringBuilder encoded_string = new StringBuilder();

        for (String s : strs){
            encoded_string.append(s.length()).append('#').append(s);
        }
        return encoded_string.toString();
        */
    }

    public List<String> decode(String str) {

    	List<String> decoded_strs = new ArrayList<>();
    	int index = 0;
    	int length = str.length();
    	char c;
    	while (index < length) {
    		int start = index;
    		while((c = str.charAt(index)) != '#'){
    			index++;
    		}
    		int end_index = Integer.parseInt(str.substring(start, index));
    		StringBuilder s = new StringBuilder();
    		while(end_index > 0) {
    			s.append(str.charAt(++index));
    			end_index--;
    		}
    		index++;
    		decoded_strs.add(s.toString());
    		
    	}
    	
    	return decoded_strs;

        /* first attempt
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
        */
    }
}
