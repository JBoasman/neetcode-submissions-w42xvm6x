class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        //Boyer-Moore) approach
        Arrays.sort(nums);
        int k = nums.length/3;
        int length = nums.length;
        List<Integer> result = new ArrayList<>();
        long prev = (long)nums[0] - 1;
       
        for (int i = 0; i + k < length;) {
            if (nums[i] == nums [i+k] && nums[i] != prev) {
                result.add(nums[i]);
                prev = nums[i];
                i += k + 1;
            } else {
                i++;
            }
        }
        return result;
    }
}