class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(target , 0 , candidates , ans , new ArrayList<>());
        return ans;
    }
    public static void findCombinations(int target,int ind,int[] arr , List<List<Integer>> ans , List<Integer>ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(target-arr[ind] , ind ,arr , ans ,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(target , ind+1 , arr , ans , ds);
    }
}