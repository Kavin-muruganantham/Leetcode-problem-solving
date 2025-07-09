class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy nums2 into nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Bubble sort the merged array
        int total = m + n;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}
