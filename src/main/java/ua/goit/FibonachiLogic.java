package ua.goit;

public class FibonachiLogic {

    public int fibonachiIteration (int n) {
        int[] fibonachi = new int[n+1];
        fibonachi[0] = 0;
        fibonachi[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
        return fibonachi[n];
    }
    //Складність алгоритму: часова - O(n), просторова O(n)

    public int fibonachiRecursion (int n) {
        int fibonachi;
        if (n <= 2) {
            return 1;
        }
        fibonachi = fibonachiRecursion(n-1) + fibonachiRecursion(n - 2);
        return fibonachi;
    }
    //Складність алгоритму: часова - O(2^n), просторова O(n)

    public int fibonachiDynamicProgramming (int n, int[] memoisation) {
        if (n <= 2) {
            return 1;
        }
        if (memoisation[n] == 0) {
            memoisation[n] = fibonachiDynamicProgramming(n - 1, memoisation)
                    + fibonachiDynamicProgramming(n - 2, memoisation);
        }
        return memoisation[n];
    }
    //Складність алгоритму: часова - O(n*log10n), просторова O(n)
}
