class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> HM = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            HM.put(nums[i],i);
        }
        int arr[]=new int[2];
        for(int idx =0 ; idx<nums.length;idx++){ 
            int ali = nums[idx];
            int toFind = target - ali;
            if(HM.containsKey(toFind) && idx!=HM.get(toFind)){
                    	arr[0]=idx;
	                	arr[1]=HM.get(toFind);
	               
            }
        }

        // int arr[]=new int[2];
	    //     for(int i=0;i<nums.length;i++){
	    //         for(int j=0;j<nums.length;j++){
	    //             if(i==j){
	    //                 continue;
	    //             }
	    //             if(nums[i]+nums[j]==target) {
	                	
	    //             	arr[0]=i;
	    //             	arr[1]=j;
	    //             }
	    //         }
	    //     }
			return arr;
    }
}