class Solution {
    public int buyChoco(int[] prices, int money) {
        int small;
        int smaller;
        if (prices[0] < prices[1]) {
            small = prices[1];
            smaller = prices[0];
        } else {
            small = prices[0];
            smaller = prices[1];
        }
        for (int i = 2; i < prices.length; i++) {
            if (prices[i] < smaller) {
                small = smaller;
                smaller = prices[i];
            } else if (prices[i] < small) small = prices[i];
        }
        return small + smaller <= money ? money - small - smaller : money;
    }
}