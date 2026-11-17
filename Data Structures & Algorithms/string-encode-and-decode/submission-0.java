class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(encodeString(str));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('|', i);                        // end of the length header
            int length = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + length));   // end is exclusive
            i = j + 1 + length;                                 // start of the next header
        }
        return result;
    }

    private String encodeString(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        sb.append(length).append('|');
        sb.append(str);
        return sb.toString();
    }
}



/* Example: "Hello", "World"
Encoding hello: 5|Hello
*/
