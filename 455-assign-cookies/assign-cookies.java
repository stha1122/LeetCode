class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int res = 0;

        while (i < m && j < n) {
            while (j < n && s[j] < g[i]) {
                j++;
            }
            if (j < n) {
                res++;
                i++;
                j++;
            }

        }

        return res;
    }
}