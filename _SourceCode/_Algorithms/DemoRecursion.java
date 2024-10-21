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

    public static void main(String[] args) {
        int n = 10;
        System.out.println("factorial of " + n + " is: " + factorial(n));
        System.out.println("factorial of " + n + " is: " + factorialNormal(n));

        int nf = 3;
        System.out.println("fibo at " + nf + " is: " + fibo(nf));
        System.out.println("fibo at " + nf + " is: " + fiboNormal(nf));
    }
}
