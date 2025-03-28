public class _88_Merge_Sorted_Array_TwoPointers {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexResult = nums1.length - 1;
        int i = n - 1, j = m - 1;

        while (indexResult >= 0) {
            if (i < 0) {
                nums1[indexResult] = nums1[j];
                j--;
            } else if (j < 0) {
                nums1[indexResult] = nums2[i];
                i--;
            } else if (nums2[i] > nums1[j]) {
                nums1[indexResult] = nums2[i];
                i--;
            }
            else {
                nums1[indexResult] = nums1[j];
                j--;
            }

            indexResult--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(nums1.toString());
    }
}
