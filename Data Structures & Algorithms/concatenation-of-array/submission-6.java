class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[2 * n];
        int index1 = 0;
        int index2 = n;
        
        for (int elem : nums) {
            newNums[index1] = nums[index1];
            newNums[index2++] = nums[index1++];
        }
          
        return newNums;
    }
}