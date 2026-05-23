class Solution {
    public boolean isAnagram(String s, String t) {
        return (frequencyHelper(s.toCharArray()).equals(frequencyHelper(t.toCharArray())));
    }
    public HashMap<Character, Integer> frequencyHelper(char[] chars) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : chars) {
            if (counts.containsKey(c)) {
                int currentCount = counts.get(c);
                counts.put(c, currentCount + 1);
            } else {
                counts.put(c, 1);
            }
        }
        return counts;
    }
}
