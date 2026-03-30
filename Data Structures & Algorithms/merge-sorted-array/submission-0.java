class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m;
        int index2 = 0;
        for (int num : nums2) {
            nums1[index1++] = nums2[index2++]; 
        }
        Arrays.sort(nums1);
    }
}