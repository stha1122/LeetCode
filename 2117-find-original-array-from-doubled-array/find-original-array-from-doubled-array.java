class Solution {
    public int[] findOriginalArray(int[] c) {
        int n = c.length;
        int max = 0;

        for(int i=0; i<n; i++){
            max = Math.max(max, c[i]);
        }

        int[] sorted = new int[max+1];

        for(int i=0; i<n; i++){
            sorted[c[i]]++;
        }
        
        int[] ans = new int[n/2];
        int itr=0;

        if(sorted[0]%2 == 1)    
            return new int[0];
            
        for(int i=1; i<=max; i++){
            if(sorted[i] > 0){
                if(2*i > max || sorted[i] > sorted[2*i])
                    return new int[0];
                else{
                    sorted[2*i]-=sorted[i];
                    for(int j=1; j<=sorted[i]; j++)
                        ans[itr++] = i;
                }
            }
        }

        return ans;
    }
}