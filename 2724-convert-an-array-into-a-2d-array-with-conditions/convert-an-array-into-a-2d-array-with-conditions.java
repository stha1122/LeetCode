class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        int[] freq = new int[nums.length+1];

        List<List<Integer>> out = new ArrayList<>();

        for(int i=0; i < nums.length; i++){
            
            if(out.size() < freq[nums[i]]+1)
                out.add(new ArrayList<>());

            out.get(freq[nums[i]]).add(nums[i]);

            freq[nums[i]] = freq[nums[i]] +1;
        }

        return out;
    }
}

