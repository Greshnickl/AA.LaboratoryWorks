public class Main {
    public static void main(String[] args) {
        Algorithms alg = new Algorithms();
        int[] firstInput = {5, 7, 10, 12, 15, 17, 20, 22, 25, 27, 30, 32, 35, 37, 40, 42, 45};
        int[] secondInput = {501, 631, 794, 1000, 1259, 1585, 1995, 2512, 3162, 3981, 5012, 6310, 7943, 10000, 12589, 15849};

        long[] timeRecursive = new long[firstInput.length];
        long[] timeIterative = new long[firstInput.length];
        long[] timeMatrix = new long[firstInput.length];
        long[] timeMemoization = new long[firstInput.length];
        long[] timeBinet = new long[firstInput.length];
        long[] timeBottomUp = new long[firstInput.length];

        for (int i = 0; i < firstInput.length; i++) {
            int n = firstInput[i];

            // Test the time of execution of the recursive approach
            long start = System.nanoTime();
            alg.recursiveApproach(n);
            long end = System.nanoTime();
            timeRecursive[i] = end - start;

            // Test the time of execution of the iterative approach
            start = System.nanoTime();
            alg.iterativeApproach(n);
            end = System.nanoTime();
            timeIterative[i] = end - start;

            // Test the time of execution of the matrix approach
            start = System.nanoTime();
            alg.fibonacciMatrix(n);
            end = System.nanoTime();
            timeMatrix[i] = end - start;

            // Test the time of execution of the memoization approach
            start = System.nanoTime();
            alg.fibonacciMemoization(n);
            end = System.nanoTime();
            timeMemoization[i] = end - start;

            // Test the time of execution of the Binet approach
            start = System.nanoTime();
            alg.fibonacciBinet(n);
            end = System.nanoTime();
            timeBinet[i] = end - start;

            // Test the time of execution of the bottom-up approach
            start = System.nanoTime();
            alg.fibonacciBottomUp(n);
            end = System.nanoTime();
            timeBottomUp[i] = end - start;
        }

        // Print results for the first input
        System.out.println("Results for the first input:");
        printResults(firstInput, timeRecursive, timeIterative, timeMatrix, timeMemoization, timeBinet, timeBottomUp);

        // Reinitialize time arrays for second input
        timeIterative = new long[secondInput.length];
        timeMatrix = new long[secondInput.length];
        timeMemoization = new long[secondInput.length];
        timeBinet = new long[secondInput.length];
        timeBottomUp = new long[secondInput.length];

        for (int i = 0; i < secondInput.length; i++) {
            int n = secondInput[i];

            // Test the time of execution of the iterative approach
            long start = System.nanoTime();
            alg.iterativeApproach(n);
            long end = System.nanoTime();
            timeIterative[i] = end - start;

            // Test the time of execution of the matrix approach
            start = System.nanoTime();
            alg.fibonacciMatrix(n);
            end = System.nanoTime();
            timeMatrix[i] = end - start;

            // Test the time of execution of the memoization approach
            start = System.nanoTime();
            alg.fibonacciMemoization(n);
            end = System.nanoTime();
            timeMemoization[i] = end - start;

            // Test the time of execution of the Binet approach
            start = System.nanoTime();
            alg.fibonacciBinet(n);
            end = System.nanoTime();
            timeBinet[i] = end - start;

            // Test the time of execution of the bottom-up approach
            start = System.nanoTime();
            alg.fibonacciBottomUp(n);
            end = System.nanoTime();
            timeBottomUp[i] = end - start;
        }

        // Print results for the second input
        System.out.println("Results for the second input:");
        printResults(secondInput, timeIterative, timeMatrix, timeMemoization, timeBinet, timeBottomUp);
    }

    private static void printResults(int[] input, long[]... times) {
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s %-12s%n",
                "Input Size", "Recursive", "Iterative", "Matrix", "Memoization", "Binet", "Bottom Up");
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%-10d ", input[i]);
            for (long[] time : times) {
                System.out.printf("%-12d ", time[i]);
            }
            System.out.println();
        }
    }
}
