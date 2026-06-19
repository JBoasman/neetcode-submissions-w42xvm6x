class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> history = new HashSet<>();
        for (int i : nums) {
            if (!history.add(i)) {
                return true;
            }
        }
        return false;
    }
}