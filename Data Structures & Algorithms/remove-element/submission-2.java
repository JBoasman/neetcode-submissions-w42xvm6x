class Solution {
    public int removeElement(int[] nums, int val) {
        int count = countList(nums, val);
        int index = 0;
        int toInsert = 0;
        for (int num : nums) {
            if (num != val) {
                nums[toInsert++] = nums[index++];
            } else {index++;}
        } 
        return count;
    }
    public int countList(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if (num != val) count++;
        } 
        return count;
    } 
}