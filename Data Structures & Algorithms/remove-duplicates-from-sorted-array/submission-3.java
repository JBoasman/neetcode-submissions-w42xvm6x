class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        int[] tempList = new int[nums.length];
        int tempListIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (!record.contains(nums[i])) {
                record.add(nums[i]);
                nums[tempListIndex++] = nums[i];  
            }
        }

        return tempListIndex;
    }
}