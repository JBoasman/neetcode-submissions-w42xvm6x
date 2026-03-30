class Solution {
    public boolean isValid(String s) {
      Stack<Character> memory = new Stack<>();
      char[] temp = s.toCharArray();
      for (char elem : temp) {
        if (elem == '(' || elem == '{' || elem == '[') {
            memory.push(elem);
        } else {
            if (memory.isEmpty()) {
                return false;
            }
            char latestPop = memory.pop();
            if (elem == ')' && latestPop != '(') {
                return false;
            }
            if (elem == '}' && latestPop != '{') {
                return false;
            }
            if (elem == ']' && latestPop != '[') {
                return false;
            }
        }
      }
    return memory.isEmpty();
    }
}
