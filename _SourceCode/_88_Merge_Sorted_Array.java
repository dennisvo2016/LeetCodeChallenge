import java.lang.reflect.Array;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int nums2_i : nums2) {
            insertToArray(nums1, m, nums2_i);
            m++;
        }
    }

    private static void insertToArray(int[] nums1, int m, int nums2_i) {
        boolean isChanged = false;
        
        for (int i = 0; i < m; i++) {
            var nums1_i = nums1[i];
            if (nums2_i < nums1_i) {
                isChanged = true;

                for (int j = m-1; j >= i; j--) {
                    nums1[j+1] = nums1[j]; 
                }
                nums1[i] = nums2_i;
                break;
            }
        }

        if (!isChanged) {
            nums1[m] = nums2_i;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(nums1.toString());
    }
}
