class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
		// we would use the hashset to store the base 10 representation of the binary strings
        Set<Integer> set = new HashSet<>();
		
		// res will store the result
        String res = "";
        
		// iterate through the list of binary strings, convert them to decimal and store in the hashset
        for(String i : nums)set.add(Integer.parseInt(i,2));
		
		// as the range is from 1 to 16 in the question, so we check for any one number that is missing in the hashset from 1 to 16
        for(int i = 0 ;i <= 16; i++){
            if(!set.contains(i)){
			// when we find the missing number , we store its binary form in res and break out of the loop
                res = Integer.toBinaryString(i);
                break;
            }
        }
        
		// we convert res to the required length for the binary representation as per the binary strings in the list  "nums"
        StringBuilder temp = new StringBuilder(res);
        while(temp.length() < nums[0].length())temp.insert(0,0);
        res = temp.toString();
        
		// return the result
        return res;
    }
}