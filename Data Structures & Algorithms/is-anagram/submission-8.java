class Solution {
    public boolean isAnagram(String s, String t) {
        
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
