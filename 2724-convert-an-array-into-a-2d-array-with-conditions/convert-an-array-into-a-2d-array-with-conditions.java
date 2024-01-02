class Solution {
       public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n + 1];

        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            if (result.size() <= counts[num]) {
                result.add(new ArrayList<>());
            }
            result.get(counts[num]++).add(num);
        }

        return result;
    }
}