class Solution {
    public boolean find132pattern(int[] nums) {
        int num3 = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
            if(nums[i]<num3){
                return true;
            }
            while(!stack.isEmpty() && nums[i]>stack.peek()){
                num3 = stack.peek();
                stack.pop();
            }

            stack.push(nums[i]);
        }
    return false;

    }
}