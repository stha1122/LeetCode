class Solution {
    public int maxCoins(int[] piles) {
        int max = 0;
        int n = piles.length;

        for(int i : piles)
        {
            if(max < i) max = i;
        }

        int[] coins = new int[max+1];

        for(int i : piles)
        {
            coins[i]++;
        }
        
        int sum = 0;
        int chance = n / 3;

        int turn = 1;
        int i = max;

        while(chance != 0){
            if(coins[i] > 0){
                if(turn == 1) turn = 0;
                else {
                    chance--;
                    turn = 1;
                    sum += i;
                }
                coins[i]--;
            }else{
                i--;
            }
        }

        return sum;
    }
}