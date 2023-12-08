public class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int n = nums.length;
        int[] minArray = new int[n];

        minArray[0] = nums[0];
        for (int i = 1; i < n; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek() < nums[j]) {
                return true;
            }

            stack.push(nums[j]);
        }

        return false;
    }
}