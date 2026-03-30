class Solution {
    public boolean validPalindrome(String s) {
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
                    return removalPotential(left, right, s);
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

    public boolean removalPotential(int left, int right, String s) {
        String leftIncrementCheck = s.substring(left+1, right+1);
        String rightIncrementCheck = s.substring(left, right);
        return (isPalindrome(leftIncrementCheck) || isPalindrome(rightIncrementCheck));
    }

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
}