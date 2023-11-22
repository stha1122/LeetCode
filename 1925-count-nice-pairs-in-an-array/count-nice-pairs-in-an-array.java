import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countNicePairs(int[] nums) {
        final int MOD = 1_000_000_007;
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            int diff = num - reverse(num);
            frequencyMap.put(diff, frequencyMap.getOrDefault(diff, 0) + 1);
        }

        for (int freq : frequencyMap.values()) {
            // For each frequency, add the number of nice pairs that can be formed
            // The formula for the number of pairs is (freq * (freq - 1)) / 2
            count = (int) ((count + (long) freq * (freq - 1) / 2) % MOD);
        }

        return count;
    }

    // Helper function to reverse an integer
    private int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
