class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> history = new HashMap<>();
        int slow = 0;
        int fast = 0;
        int length = s.length();
        int current = 0;
        int max = 0;
        while (fast < length) {
            Character fastChar = s.charAt(fast);
            if (history.containsKey(fastChar)) {
                slow = Math.max(slow, history.get(fastChar) + 1);
                if (current > max) {
                    max = current;
                }
                current = 0;
            }
            history.put(fastChar, fast);
            fast++;
            current = fast - slow;
        }
        if (current > max) {
            max = current;
        }
        return max;
    }
}
