class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char lChar = normalise(s.charAt(left));
            char rChar = normalise(s.charAt(right));
            if (lChar == '\0') {
                left++;
            }
            else if (rChar == '\0') {
                right--;
            }
            else {
                if (lChar != rChar) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public char normalise(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))  {
            return c;
        }
        if (c >= 'A' && c <= 'Z')  {
            return (char)(c + 32);
        }
        else {
            return '\0';
        }
    }
}
