class Solution {
    public void sortColors(int[] nums) {
        int zeroPointer = 0;
        int twoPointer = nums.length - 1;
        for (int i = 0; i <= twoPointer;) {
            if (nums[i] == 0) {
                nums[i] = nums[zeroPointer];
                nums[zeroPointer] = 0;
                zeroPointer++;
                i++;
            } else if (nums[i] == 2) {
                nums[i] = nums[twoPointer];
                nums[twoPointer] = 2;
                twoPointer--;
            } else {
                i++;
            }
        }
    }
}