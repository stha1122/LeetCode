import java.util.Arrays;

class Solution {
    
    // Define a method named maxCoins, which takes an array of integers (piles) as input and returns an integer
    public int maxCoins(int[] piles) {
        
        // Sort the array piles in ascending order
        Arrays.sort(piles);
        
        // Initialize variables to keep track of the sum of coins and pointers for array traversal
        int sum = 0;          // to store the total sum of coins obtained
        int i = 0;            // pointer for iterating through the array
        int j = piles.length - 2;  // pointer starting from the second-to-last index
        
        // Calculate the total number of valid piles to consider (every third pile)
        int total_piles = piles.length / 3;
        
        // Iterate through the array in steps of 2 (picking every third pile)
        while (i++ < total_piles) {
            
            // Add the value at index j to the sum
            sum += piles[j];
            
            // Update j by decrementing it by 2 to move to the next valid index
            j -= 2;
        }
        
        // Return the final sum, representing the maximum number of coins you can collect
        return sum;
    }
}
