import java.util.Arrays;

public class FibonacciTest {

    static class Algorithms {
        // Recursive approach
        public int recursiveApproach(int n) {
            if (n <= 1)
                return n;
            return recursiveApproach(n - 1) + recursiveApproach(n - 2);
        }

        // Iterative approach
        public int iterativeApproach(int n) {
            if (n <= 1)
                return n;
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = b;
                b = a + b;
                a = temp;
            }
            return b;
        }

        // Matrix approach
        public int[][] multiplyMatrix(int[][] a, int[][] b) {
            int[][] result = new int[2][2];
            result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
            result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
            result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
            result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
            return result;
        }

        public int[][] powerMatrix(int[][] mat, int n) {
            if (n == 1)
                return mat;
            if (n % 2 == 0) {
                int[][] temp = powerMatrix(mat, n / 2);
                return multiplyMatrix(temp, temp);
            } else {
                int[][] temp = powerMatrix(mat, (n - 1) / 2);
                return multiplyMatrix(multiplyMatrix(temp, temp), mat);
            }
        }

        public int fibonacci_matrix(int n) {
            if (n == 0)
                return 0;
            int[][] baseMatrix = {{1, 1}, {1, 0}};
            int[][] resultMatrix = powerMatrix(baseMatrix, n - 1);
            return resultMatrix[0][0];
        }

        // Memoization approach
        public int fibonacci_memoization(int n, int[] memo) {
            if (n <= 1)
                return n;
            if (memo[n] == 0)
                memo[n] = fibonacci_memoization(n - 1, memo) + fibonacci_memoization(n - 2, memo);
            return memo[n];
        }

        // Binet's formula approach
        public int fibonacci_binet(int n) {
            double sqrt5 = Math.sqrt(5);
            double phi = (1 + sqrt5) / 2;
            return (int) Math.round(Math.pow(phi, n) / sqrt5);
        }

        // Bottom-up approach
        public int fibonacci_bottom_up(int n) {
            if (n <= 1)
                return n;
            int[] fib = new int[n + 1];
            fib[1] = 1;
            for (int i = 2; i <= n; i++)
                fib[i] = fib[i - 1] + fib[i - 2];
            return fib[n];
        }
    }

    public static void main(String[] args) {
        FibonacciTest.Algorithms alg = new FibonacciTest.Algorithms();
        int[] firstInput = {5, 7, 10, 12, 15, 17, 20, 22, 25, 27, 30, 32, 35, 37, 40, 42, 45};
        int[] secondInput = {501, 631, 794, 1000, 1259, 1585, 1995, 2512, 3162, 3981, 5012, 6310, 7943, 10000, 12589, 15849};

        // Test the time of execution for different approaches
        long[] timeRecursive = new long[firstInput.length];
        long[] timeIterative = new long[firstInput.length];
        long[] timeMatrix = new long[firstInput.length];
        long[] timeMemoization = new long[firstInput.length];
        long[] timeBinet = new long[firstInput.length];
        long[] timeBottomUp = new long[firstInput.length];

        for (int i = 0; i < firstInput.length; i++) {
            long start = System.nanoTime();
            alg.recursiveApproach(firstInput[i]);
            long end = System.nanoTime();
            timeRecursive[i] = end - start;

            start = System.nanoTime();
            alg.iterativeApproach(firstInput[i]);
            end = System.nanoTime();
            timeIterative[i] = end - start;

            start = System.nanoTime();
            alg.fibonacci_matrix(firstInput[i]);
            end = System.nanoTime();
            timeMatrix[i] = end - start;

            int[] memo = new int[firstInput[i] + 1];
            start = System.nanoTime();
            alg.fibonacci_memoization(firstInput[i], memo);
            end = System.nanoTime();
            timeMemoization[i] = end - start;

            start = System.nanoTime();
            alg.fibonacci_binet(firstInput[i]);
            end = System.nanoTime();
            timeBinet[i] = end - start;

            start = System.nanoTime();
            alg.fibonacci_bottom_up(firstInput[i]);
            end = System.nanoTime();
            timeBottomUp[i] = end - start;
        }

        // Display results in a table
        String[] headers = {"Input Size", "Recursive", "Iterative", "Matrix", "Memoization", "Binet", "Bottom Up"};
        Object[][] data = new Object[firstInput.length][headers.length];
        for (int i = 0; i < firstInput.length; i++) {
            data[i][0] = firstInput[i];
            data[i][1] = timeRecursive[i];
            data[i][2] = timeIterative[i];
            data[i][3] = timeMatrix[i];
            data[i][4] = timeMemoization[i];
            data[i][5] = timeBinet[i];
            data[i][6] = timeBottomUp[i];
        }
        System.out.println(Arrays.deepToString(data));

        
    }
}
