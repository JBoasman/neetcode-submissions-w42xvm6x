class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int resultIndex = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.put(num, record.getOrDefault(num, 0) + 1);
        }
        for (Integer key : record.keySet()) {
            if (record.get(key) > nums.length/3) {
                result.add(key);
            }
        }
        return result;
    }
}