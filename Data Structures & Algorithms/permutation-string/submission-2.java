class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for (int i = 0; i < s1.length(); i++) { //Both array windows created and calculated
            // 'a' - 'a' = 0, 'b' - 'a' = 1, etc.
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        // 2. Slide the window across the rest of s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // Check the current window
            if (Arrays.equals(s1Map, s2Map)) return true;

            // Slide the window forward!
            // Add the new character entering on the right
            s2Map[s2.charAt(i + s1.length()) - 'a']++; 
            
            // Subtract the old character falling off the left
            s2Map[s2.charAt(i) - 'a']--; 
        }

        // 3. Don't forget to check the very last window after the loop ends!
        return Arrays.equals(s1Map, s2Map);
    }
}
