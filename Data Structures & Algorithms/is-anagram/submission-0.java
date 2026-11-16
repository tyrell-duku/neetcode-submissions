class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       Map<Character, Integer> ss = buildFrequencyMap(s);
       Map<Character, Integer> tt = buildFrequencyMap(t);
       return ss.equals(tt);
    }


    private Map<Character, Integer> buildFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer charCount = frequencyMap.get(c);
            if (charCount != null) {
                frequencyMap.put(c, charCount + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        return frequencyMap;
    }
}
