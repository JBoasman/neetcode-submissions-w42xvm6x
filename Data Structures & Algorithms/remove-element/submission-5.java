class Solution {
    public int removeElement(int[] nums, int val) {
        int toInsert = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[toInsert++] = nums[i];
            }
        } 
        return (toInsert);
    }
}