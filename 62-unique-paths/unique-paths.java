class Solution {
    public int uniquePaths(int a, int b) {
        long res = 1;
        int n = a + b - 2;
        int r = Math.min(a - 1, b - 1);
        long ans = nCr(n, r);
        return (int) ans;
    }

    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}