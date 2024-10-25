public class DemoRecursion {
    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int factorialNormal(int n){
        // 1*2*3*...*n
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static int fibo(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboNormal(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        int[] fn = new int[n + 1];
        fn[0] = 0;
        fn[1] = 1;
        for (int i = 2; i < fn.length; i++) {
            fn[i] = fn[i - 1] + fn[i - 2];
        }

        return fn[n];
    }

    public static int sumFromOneToN(int n)
    {
        //T(n) = n + T(n-1)
        if (n < 0) {
            return -1; //invalid number
        }
        if (n == 0) {
            return 0;
        }

        return n + sumFromOneToN(n - 1);
    }

    public static int expNofA(int a, int n)
    {
        //A^(n) = A * A^(n-1)
        if (n < 0) {
            return -1; //invalid
        }
        if (n == 0) {
            return 1;
        }

        return a * expNofA(a, n - 1);
    }

    public static void printArr(int[] arr, int index)
    {
        if (index >= arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");
        printArr(arr, index + 1);
    }

    public static void main(String[] args) {
        // int n = 10;
        // System.out.println("factorial of " + n + " is: " + factorial(n));
        // System.out.println("factorial of " + n + " is: " + factorialNormal(n));

        // int nf = 3;
        // System.out.println("fibo at " + nf + " is: " + fibo(nf));
        // System.out.println("fibo at " + nf + " is: " + fiboNormal(nf));

        // int[] arr = {0, 9, 4, 6, 3, 6, 6, 9, 5, 8};
        // printArr(arr, 0);

        // int n = -5;
        // System.out.println("sum from 1 to " + n + " is: " + sumFromOneToN(n));

        int a = 4, n1 = -10;
        System.out.println("exp " + n1 + " of " + a + " is: " + expNofA(a, n1));
    }
}
