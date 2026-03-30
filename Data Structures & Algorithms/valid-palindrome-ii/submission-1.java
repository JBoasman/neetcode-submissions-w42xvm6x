class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return removalPotential(left, right, s);
            }
            left++;
            right--;
        }
        return true;
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
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}