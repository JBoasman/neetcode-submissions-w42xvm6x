class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); //Sorting list by numbers
        return recursiveHelper(nums, 0); //using helper function
    }

    private static boolean recursiveHelper(int[] nums, int i) {
    if (i >= nums.length -1) {
        return false;
    }

    if (nums[i] == nums[i+1]) {
        return true;
    }

    return recursiveHelper(nums, i+1);
    }
}