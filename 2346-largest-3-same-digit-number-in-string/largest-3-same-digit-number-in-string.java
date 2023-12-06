class Solution {
    public String largestGoodInteger(String nums) {
        int good_integer = 0,max_good_integer = Integer.MIN_VALUE;
        for(int i=0;i<nums.length()-2;i++){
            if(nums.charAt(i)==nums.charAt(i+1) && nums.charAt(i+1)==nums.charAt(i+2)){
              
                    good_integer = (nums.charAt(i)-'0')*100+((nums.charAt(i)-'0')*10)+(nums.charAt(i)-'0');
                    max_good_integer = Math.max(good_integer,max_good_integer);
            }
        }
        if(max_good_integer==0){
            return "000";
        }
        if(max_good_integer==Integer.MIN_VALUE){
            return "";
        }
        return Integer.toString(max_good_integer);
        
    }
}