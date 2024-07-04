public class _1295_Find_Numbers_with {
    public static int findNumbers(int[] nums) {
        int result = 0;
        
        for (int i : nums) {
            if (hasEvenNumberOfDigits(i)) {
                result++;
            }
        }

        return result;
    }
    
    private static boolean hasEvenNumberOfDigits(int i) {
        int count = 0;
        int result = i;

        while (result != 0) {
            result = i / 10;
            i = result;
            count++;
        }

        return count % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println("\n Output: " + findNumbers(nums));
    }
}