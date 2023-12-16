class Solution {
    public int search(int[] nums, int target) {
        int x=0,n=nums.length-1;
    
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1]){
                x=i+1;
                break;
            }
        }
           

            if(target>=nums[x] && target<=nums[n]){
                int left = x;
                int right = n;
        
                while(right>=x && left<=n && left<=right  ){
                    int mid = (left+right)/2;
                      System.out.println(mid);
                    if(nums[mid]==target){
                        return mid;
                    }
                    else if(target>nums[mid]){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                }

            }
                else {
                   
                     int left = 0;
                    int right = x-1;
                while(right>=0 && left<=x-1 && left<=right  ){
                    int mid = (left+right)/2;
                    if(nums[mid]==target){
                        return mid;
                    }
                    else if(target>nums[mid]){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                }
            }
            return -1;
            
    }
}