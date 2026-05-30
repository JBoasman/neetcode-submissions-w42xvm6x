class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#CODE").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> listToReturn = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // 1. Find the delimiter to get the length; finds first occurance of #code at an index in main str after i;
            int delimiterIndex = str.indexOf("#CODE", i);
            
            // 2. Extract the length (it could be "5" or "100"); because the length could be in the double digits, take value between i and the delimiter;
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            
            // 3. Move pointer to the start of the actual string; shift index by length of delimiter
            i = delimiterIndex + 5;
            
            // 4. Extract the actual word using the length
            String word = str.substring(i, i + length);
            listToReturn.add(word);
            
            // 5. Move pointer to the start of the next encoded block
            i += length;
        }
        
        return listToReturn;
    }
}
