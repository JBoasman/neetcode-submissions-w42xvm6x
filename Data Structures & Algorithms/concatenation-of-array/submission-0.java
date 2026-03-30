class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        System.arraycopy(nums, 0, newNums, nums.length, nums.length);
        return newNums;
    }
}