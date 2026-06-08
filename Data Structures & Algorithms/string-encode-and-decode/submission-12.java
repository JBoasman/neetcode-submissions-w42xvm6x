class Solution {
    private String preCode = "#";

    public String encode(List<String> strs) {
        StringBuilder code = new StringBuilder();
        for (String s : strs) {
            int length = s.length();
            code.append(length).append(preCode).append(s);
        }
        return code.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int codeLength = str.length();
        int i = 0;
        
        while (i < codeLength) {
            int preCodeIndex = str.indexOf(preCode, i); //returns index of first # after i;
            String wordLengthAsString = str.substring(i, preCodeIndex); //grab digiets pre index from i to find word length
            int wordLength = Integer.parseInt(wordLengthAsString); //convert string numbers to int number
            i = preCodeIndex + preCode.length();
            String s = str.substring(i, (i + wordLength));
            strs.add(s);
            i = i + wordLength;
        }
        return strs;
    }
}
