class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> Stable = new Hashtable<>();
        Hashtable<Character, Integer> Ttable = new Hashtable<>();

        for (char c : s.toCharArray()){
            if (Stable.containsKey(c)){
                Stable.put(c, Stable.get(c) + 1);
            }
            else{
                Stable.put(c, 1);
            }
        }

        for (char l : t.toCharArray()){
            if (Ttable.containsKey(l)){
                Ttable.put(l, Ttable.get(l) + 1);
            }
            else{
                Ttable.put(l, 1);
            }
        }
        if (s.length() > t.length()){
            for (char c : s.toCharArray()){
                int compare = Stable.get(c);
                if (!Ttable.containsKey(c)){
                    return false;
                }
                int other = Ttable.get(c);
                if (compare != other){
                    return false;
                }
            }
        }
        else{
            for (char c : t.toCharArray()){
                int compare = Ttable.get(c);
                if (!Stable.containsKey(c)){
                    return false;
                }
                int other = Stable.get(c);
                if (compare != other){
                    return false;
                }
            }
        }
        return true;
    }
}
