class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        int hottest = 0;
        for (int i = n - 1; i >= 0; i--) {
            int currTemp = temperatures[i];
            if (currTemp >= hottest) {
                hottest = currTemp;
                continue;
            }
            int j = i + 1;
            while (temperatures[j] <= currTemp) {
                j += res[j];
            }
            res[i] = j - i;
        }
        return res;
    }
}