import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        return getSubarraySumCount(nums, k);
    }

    public int getSubarraySumCount(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;

        // Map to store the cumulative sum and its frequency
        Map<Integer, Integer> sumFrequencyMap = new HashMap<>();
        sumFrequencyMap.put(0, 1); // Initialize with 0 to handle subarrays starting from index 0

        for (int num : nums) {
            sum += num;

            // Check if (sum - k) is present in the map, indicating a subarray with sum k
            if (sumFrequencyMap.containsKey(sum - k)) {
                count += sumFrequencyMap.get(sum - k);
            }

            // Update the frequency of the current cumulative sum
            sumFrequencyMap.put(sum, sumFrequencyMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
