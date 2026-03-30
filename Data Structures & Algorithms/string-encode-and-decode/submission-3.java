class Solution {

    public String encode(List<String> strs) {
        char[] encoded = new char[20100];
        
        int encodingIndex = 0;
        for (String str : strs) {
            encoded[encodingIndex++] = '`';
            for (int i = 0; i < str.length(); i++) {
                encoded[encodingIndex++] = str.charAt(i);
            }
            encoded[encodingIndex++] = '~';
        }

        String output = new String(encoded, 0, encodingIndex);
        return output;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int decodedIndex = 0;
        int tempIndex = 0;
        char[] temp = new char[200];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '`') {
                tempIndex = 0;
            } else if (str.charAt(i) == '~') {
                strs.add(new String(temp, 0, tempIndex));
            } else {
                temp[tempIndex++] = str.charAt(i);
            }
        }
        return strs;
    }
}
