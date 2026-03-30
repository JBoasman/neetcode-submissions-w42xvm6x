class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[2 * nums.length];
        int index1 = 0;
        int index2 = nums.length;
        
        for (int elem : nums) {
            newNums[index1] = nums[index1];
            newNums[index1 + nums.length] = nums[index1++];
        }
          
        return newNums;
    }
}