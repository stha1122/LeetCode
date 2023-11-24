class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0,i=0,j=piles.length-2;
        while(i++<piles.length/3){
            sum+=piles[j];
            j-=2;
        }
        return sum;
    }
}