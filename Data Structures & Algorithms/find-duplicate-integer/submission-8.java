class Solution {
    public int findDuplicate(int[] nums) {
        int numberFound = 0;
        for (int i = 0; i < nums.length; i++) {
            numberFound = Math.abs(nums[i]); //e.g. found 3;
            if (nums[numberFound - 1] < 0) { return Math.abs(numberFound); }
            nums[numberFound - 1] = nums[numberFound-1] * -1; //0 index the numbers as the values start from 1 not zero; make the number negative to show weve already seen it.
        }
        return numberFound;
    }
}
