class Solution {
    public boolean isValid(String s) {
        Deque<Character> history = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{' -> history.push('{');
                case '(' -> history.push('(');
                case '[' -> history.push('[');
                case '}' -> { if (history.isEmpty() || history.pop() != '{') { return false; } }
                case ')' -> { if (history.isEmpty() || history.pop() != '(') { return false; } }
                case ']' -> { if (history.isEmpty() || history.pop() != '[') { return false; } }
                default -> {} //do nothing
            }
        }
        if (!history.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
