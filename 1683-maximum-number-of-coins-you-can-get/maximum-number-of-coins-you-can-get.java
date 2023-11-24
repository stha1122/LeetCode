class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0,i=0,j=piles.length-2;
        int total_piles = piles.length/3;
        while(i++<total_piles){
            sum+=piles[j];
            j-=2;
        }
        return sum;
    }
}