class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length==3)
            return nums[0]*nums[1]*nums[2];
        int max1st=Integer.MIN_VALUE,max2nd=Integer.MIN_VALUE,max3rd=Integer.MIN_VALUE,min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        for(int num:nums){
            if(max1st<=num){
                max3rd=max2nd;
                max2nd=max1st;
                max1st=num; 
            }
            else if(max2nd<=num)
            {
                 max3rd=max2nd;
                 max2nd=num; 
            }
            else if(max3rd<=num)            
                 max3rd=num; 
            if (num<min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num<min2) {
                min2 = num;
            }
        }
        return Math.max(min1*min2*max1st,max1st*max2nd*max3rd);
    }
}

