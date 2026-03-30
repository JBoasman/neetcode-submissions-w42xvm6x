class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        int counter1 = 0;
        int counter2 = 1;
        char[] chars1 = word1.toCharArray();
        char [] chars2 = word2.toCharArray();
        int length1 = word1.length();
        int length2 = word2.length();
        char[] newWord = new char[2*length1 + 2*length2];
        for (char elem : chars1) {
            newWord[counter1++] = elem;
            counter1++;
        }
        for (char elem : chars2) {
            newWord[counter2++] = elem;
            counter2++;
        }
        int count = countList(newWord, '\0');
        char[] result = removeElement(newWord, '\0');
        char[] finalChars = new char[count];
        System.arraycopy(result, 0, finalChars, 0, count);
        String finalWord = new String(finalChars);
        return finalWord;
    }
    public char[] removeElement(char[] newWord, char c) {
        int index = 0;
        int toInsert = 0;
        for (char letter : newWord) {
            if (letter != c) {
                newWord[toInsert++] = newWord[index++];
            } else {index++;}
        }
        return newWord; 
    }
        
    public int countList(char[] newWord, char c) {
        int count = 0;
        for (char letter : newWord) {
            if (letter != c) count++;
        } 
        return count;
    } 
}