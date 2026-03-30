class Solution {
    public boolean isValid(String s) {
        Stack<Character> memory = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                memory.push(c);
            }
            else {
        
                if (memory.isEmpty()) {
                    return false;
                }
                char latestP = memory.pop();
                if (c == ')' && latestP != '(') return false;
                if (c == '}' && latestP != '{') return false; 
                if (c == ']' && latestP != '[') return false;
            }
            
        }
        return memory.isEmpty();
    }
}
