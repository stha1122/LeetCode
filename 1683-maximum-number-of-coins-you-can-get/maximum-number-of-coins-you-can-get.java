class Solution {
    public int maxCoins(int[] piles) {
        int maxPileSize = 0;
        int totalPiles = piles.length;

        // Find the maximum pile size
        for (int pileSize : piles) {
            if (maxPileSize < pileSize) maxPileSize = pileSize;
        }

        // Create a frequency array to count the number of occurrences of each pile size
        int[] pileFrequency = new int[maxPileSize + 1];

        for (int pileSize : piles) {
            pileFrequency[pileSize]++;
        }

        int totalCoins = 0;
        int roundsLeft = totalPiles / 3;

        int currentPlayer = 1;
        int currentPile = maxPileSize;

        // Simulate the process of picking piles
        while (roundsLeft != 0) {
            if (pileFrequency[currentPile] > 0) {
                if (currentPlayer == 1) currentPlayer = 0;
                else {
                    roundsLeft--;
                    currentPlayer = 1;
                    totalCoins += currentPile;
                }
                pileFrequency[currentPile]--;
            } else {
                currentPile--;
            }
        }

        // Return the maximum sum of coins
        return totalCoins;
    }
}
