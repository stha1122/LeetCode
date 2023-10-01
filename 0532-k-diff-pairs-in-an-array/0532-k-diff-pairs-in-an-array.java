class Solution {
    public int findPairs(int[] nums, int k) {
        // Sort the array to make it easier to find pairs.
        Arrays.sort(nums);
        
        int count = 0;
        int left = 0;
        int right = 1;
        
        while (left < nums.length && right < nums.length) {
            int diff = nums[right] - nums[left];
            
            if (diff == k && left != right) {
                count++;
                // Move both pointers to avoid counting duplicates.
                left++;
                right++;
                while (right < nums.length && nums[right] == nums[right - 1]) {
                    right++;
                }
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            } else if (diff < k || left == right) {
                right++;
            } else {
                left++;
            }
        }
        
        return count;
    }
}

