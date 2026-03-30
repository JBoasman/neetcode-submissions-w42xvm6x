class Solution {
    public void reverseString(char[] s) {
        int x = s.length - 1;
        int index = 0;
        while (index < x) {
            char temp = s[index];
            s[index++] = s[x];
            s[x--] = temp;
        }
    } 
}