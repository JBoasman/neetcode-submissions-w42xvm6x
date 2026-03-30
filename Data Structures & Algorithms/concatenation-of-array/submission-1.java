class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[2 * n];
        int index1 = 0;
        int index2 = 0;
        
        for (int elem : nums) {
            newNums[index1] = nums[index1];
            index1++;
        }
        
        for (int elem : nums) {
            newNums[n] = nums[index2];
            index2++;
            n++;
        }
        
        return newNums;
    }
}