class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])] < 0) {
                return  Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i])] = nums[Math.abs(nums[i])] * - 1;
            }
            //if nums[i] = 3;
            //index 3 = index 3 * -1 (e.g. 57 becomes -57)
            //whenver check a nums[i] for the first time; i want to check the index in the list of that value/
        }
        return -1;
        
    }
}
