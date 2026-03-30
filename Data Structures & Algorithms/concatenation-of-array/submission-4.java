class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[2 * nums.length];
        int index1 = 0;
        int index2 = 0;
        
        for (int elem : nums) {
            newNums[index1] = nums[index1++];
        }
        
        for (int elem : nums) {
            newNums[index1++] = nums[index2++];
        }
        
        return newNums;
    }
}