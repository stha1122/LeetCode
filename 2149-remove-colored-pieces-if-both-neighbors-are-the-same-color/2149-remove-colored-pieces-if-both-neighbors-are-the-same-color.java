public class Solution {
    public boolean winnerOfGame(String colors) {
        int countA = 0; // Count of valid moves for Alice
        int countB = 0; // Count of valid moves for Bob
        
        // Iterate through the string and count valid moves
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A') {
                countA++;
            } else if (colors.charAt(i - 1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i + 1) == 'B') {
                countB++;
            }
        }
        
        // Alice wins if she has more valid moves
        return countA > countB;
    }
}
