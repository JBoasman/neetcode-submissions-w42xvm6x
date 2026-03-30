class Solution {
    public boolean isPalindrome(String s) {
        String alphaNumericString = new StringBuilder(s).toString().replaceAll("[^a-zA-Z0-9]", "");
        char[] normalChar = alphaNumericString.toLowerCase().toCharArray();
        String reversedString = new StringBuilder(alphaNumericString).reverse().toString().toLowerCase();
        char[] reverseChar = reversedString.toCharArray();
        return Arrays.equals(normalChar, reverseChar);

    }
}