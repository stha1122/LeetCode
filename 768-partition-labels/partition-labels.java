class Solution {
    public List<Integer> partitionLabels(String s) {
        // List to store the sizes of partitions
        List<Integer> result = new ArrayList<>();

        // Array to store the last occurrence index of each character
        int[] last = new int[26];

        // Fill the 'last' array with the last occurrence index of each character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        // Initialize pointers for the current partition's start and end
        int start = 0;
        int end = 0;

        // Iterate through the string to find partition sizes
        for (int i = 0; i < s.length(); i++) {
            // Determine the last occurrence index of the current character
            int currentEnd = last[s.charAt(i) - 'a'];

            // Update 'end' to be the maximum of its current value and the last occurrence index of the current character
            end = Math.max(end, currentEnd);

            // If the current index is equal to 'end', it indicates the end of the current partition
            // Add the length of the partition to the result list, and update 'start' to the next index
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        // Return the list of partition sizes
        return result;
    }
}
