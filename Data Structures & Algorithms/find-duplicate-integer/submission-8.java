class Solution {
    public int findDuplicate(int[] nums) {
        int count = 0;
        boolean found = false;
        while (found == false) {
            int current = Math.abs(nums[count]);
            if (nums[current] < 0) {
                found = true;
                return current;
            } else {
                nums[current] = - nums[current];
            }
            count++;
        }
        return 0;
    }
}
