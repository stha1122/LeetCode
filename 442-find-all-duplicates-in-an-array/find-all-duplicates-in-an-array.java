class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean arr[] = new boolean[nums.length+1];
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]){
                res.add(nums[i]);

            }
            else{
                            arr[nums[i]] = true;
            }
        }
        return res; 
    }
}