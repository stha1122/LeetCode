class Solution {
    public static int maxArea(int[] height) {
        int maxCost =  0;
        int h1 = 0;
        int h2 = height.length-1;
        while(h1<h2) {
        	int w = h2 - h1;
        	int h = Math.min(height[h1], height[h2]);
        	int curr_cost =  w*h;
        	maxCost = Math.max(maxCost, curr_cost);
        	if(height[h1]>height[h2]) {
        		h2--;
        	}
            else{
        	h1++;
            }
        }
        return maxCost;
    }
}