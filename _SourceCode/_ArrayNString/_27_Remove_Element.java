public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        return removeElement_sol2(nums, val);
    }

    public static int removeElement_sol1(int[] nums, int val) {
        int count = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (i == count -1) {
                    count--;
                    break;
                }

                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }
                count--;
                i--;
            }
        }

        return count;
    }

    public static int removeElement_sol2(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] num = {3,2,2,3};
        int val = 3;

        int result = removeElement(num, val);

        System.out.println("Result: " + result);
    }
}
