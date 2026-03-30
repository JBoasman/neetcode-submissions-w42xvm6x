class Solution {
    public int firstMissingPositive(int[] nums) {
        int index = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]) { //nums[0] == 1, nums[1] == 2...
                //we have a numer that is relevant but NOT in the right place, eg. 3 at index 0 in n length 5;
                temp = nums[nums[i] - 1]; //the value at index 2 should be 3, so we save the value at index 2
                nums[nums[i]- 1] = nums[i]; //we set the value at index 2 to be 3, which is nums[i];
                nums[i] = temp; //set the value at nums[i] to equal what was in index 2.
                //if the number here is "bad" we dont want to put it anywhere, so we ignore it and cycle to next i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i+1;
            }
        }
        return nums.length + 1;
    }
}