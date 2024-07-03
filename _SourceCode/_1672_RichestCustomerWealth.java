public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        return maximumWealth_sol2(accounts);
    }

    public static int maximumWealth_sol1(int[][] accounts) {
        int numOfAccounts = accounts.length;
        int numOfBanks = accounts[0].length;

        int[] result = new int[numOfAccounts];

        for (int i = 0; i < numOfAccounts; i++) {
            int sum = 0;
            for (int j = 0; j < numOfBanks; j++) {
                sum += accounts[i][j];
            }
            result[i] = sum;
        }

        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
            }
        }

        return max;
    }

    public static int maximumWealth_sol2(int[][] accounts) {
        int numOfAccounts = accounts.length;
        int numOfBanks = accounts[0].length;

        int max = 0;
        for (int i = 0; i < numOfAccounts; i++) {
            int sum = 0;
            for (int j = 0; j < numOfBanks; j++) {
                sum += accounts[i][j];
            }

            if (max < sum) {
                max = sum;                
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{1,5}, {7,3}, {3,5}};

        int result = maximumWealth(accounts);

        System.out.println("Result: " + result);
    }
}
