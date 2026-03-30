class Solution {
    public boolean isAnagram(String s, String t) {
       char[] sLetters = s.toCharArray();
       char[] tLetters = t.toCharArray();

       Arrays.sort(sLetters);
       Arrays.sort(tLetters);

       return Arrays.equals(sLetters, tLetters);

    }
}
