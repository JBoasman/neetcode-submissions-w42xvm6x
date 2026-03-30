class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);

            if (frequency.get(num) > nums.length/2) {
                return num;
            }
        }
        return 0;
    }
}