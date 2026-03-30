class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int toInsert = 0;
        for (int num : nums) {
            if (num != val) {
                nums[toInsert++] = nums[index++];
            } else {index++;}
        } 
        return (toInsert);
    }

}