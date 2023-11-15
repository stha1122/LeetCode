class Solution {
    public int largestPerimeter(int[] nums) {
       
        int n = nums.length;
        if(n == 3){
            if(nums[1] + nums[2] > nums[0] && nums[0] + nums[2] > nums[1] && nums[0] + nums[1] >nums[2]){
                return nums[0] + nums[1] + nums[2];
            }
            else{
                return 0;
            }
        }
        swap(nums, n-1);
        swap(nums, n-2);
        swap(nums, n-3);

        for(int i = n-1; i>=2; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
            else if(i>2){
                swap(nums, i-3);
            }
        }
        return 0;
    }


    public void swap(int[] nums, int index){
        int max = 0, maxIndex = -1;
        for(int i = 0; i<=index; i++){
            if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        int temp = nums[index];
        nums[index] = max;
        nums[maxIndex] = temp;
    }
}