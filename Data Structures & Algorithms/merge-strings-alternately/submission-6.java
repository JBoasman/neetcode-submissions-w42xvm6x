class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Pointer = 0;
        int word2Pointer = 0;
        int newWordPointer = 0;
        int min = Math.min(word1.length(), word2.length());
        char[] newWord = new char[(word1.length() + word2.length())];

        for (int i = 0; i < min; i++) {
            newWord[newWordPointer++] = word1.charAt(word1Pointer++);
            newWord[newWordPointer++] = word2.charAt(word2Pointer++);
        }

        if (word1Pointer < word1.length()) {
            for (; newWordPointer < newWord.length; newWordPointer++) {
                newWord[newWordPointer] = word1.charAt(word1Pointer++);
            }
        }
        if (word2Pointer < word2.length()) {
            for (; newWordPointer < newWord.length; newWordPointer++) {
                newWord[newWordPointer] = word2.charAt(word1Pointer++);
            }
        }
        return new String(newWord);
    }
}