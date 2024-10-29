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

    public static int findUCLN(int num1, int num2)
    {
        /*
         * Ước Chung Lớn Nhất (UCLN) của 2 số a, b là số lớn nhất mà 2 số a và b cùng chia hết
         * Euclid Algorithm
         * a = b*x + r;
         * if r == 0, return b
         * if r <> 0, b = r*y + r1 -> then check again until r == 0
         */
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }

        int r = num1 % num2;
        if (r == 0) {
            return num2;
        }

        return findUCLN(num2, r);
    }

    public static int findBCNN(int num1, int num2)
    {
        //Bội Chung Nhỏ Nhất (BCNN) của 2 số a, b là số nhỏ nhất mà chia hết đồng thời cho cả a và b
        if (num1 == 0 || num2 == 0) {
            return -1; //error
        }

        int run = 0;
        if (num1 > num2) {
            run = num1;
            if (num1 % num2 == 0) {
                return num1;
            }
            else return findBCNNRecur(num1, num2, run, 1, run);
        }
        else{
            run = num2;
            if (num2 % num1 == 0) {
                return num2;
            }
            else return findBCNNRecur(num1, num2, run, 1, run);
        }
    }

    public static int findBCNNRecur(int num1, int num2, int startRun, int indexRun, int currRun)
    {
        //Bội Chung Nhỏ Nhất (BCNN) của 2 số a, b là số nhỏ nhất mà chia hết đồng thời cho cả a và b
        //Dùng cách run + 1 sau mỗi lần lặp cũng ok nhưng sẽ tăng lũy tiến -> ko nhanh
        //Dùng cách run * (1, 2, 3,...) sẽ nhanh đến đích hơn
        
        if (currRun % num1 == 0 && currRun % num2 == 0) {
            return currRun;
        }

        return findBCNNRecur(num1, num2, startRun, indexRun + 1, startRun * (indexRun + 1));
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

        // int a = 4, n1 = -10;
        // System.out.println("exp " + n1 + " of " + a + " is: " + expNofA(a, n1));

        int num1 = 28, num2 = 20;
        // System.out.println("UCLN of " + num1 + " and " + num2 + " is " + findUCLN(num1, num2));
        System.out.println("BCNN of " + num1 + " and " + num2 + " is " + findBCNN(num1, num2));
    }
}
