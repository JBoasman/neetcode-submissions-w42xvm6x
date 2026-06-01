class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sletters = s.toCharArray();
        char[] tletters = t.toCharArray();
        Arrays.sort(sletters);
        Arrays.sort(tletters);

        return Arrays.equals(sletters, tletters);
        /*
        for (int i = 0; i < s.length(); i++) {
            if (sletters[i] != tletters[i]) {
                return false;
            }
        }
        
        return true;
        */
    }
}
