class Solution {
    public int search (int[] nums, int target) {
        return (searchHelper (nums, target, 0));
    } 
    public int searchHelper(int[] nums, int target, int index) {
        if (nums.length == 0 || nums.length <= index) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return searchHelper (nums, target, (index+1)); 
    }
}
