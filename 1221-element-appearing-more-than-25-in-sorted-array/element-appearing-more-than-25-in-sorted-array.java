class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = Integer. MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        int freArray[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            freArray[temp]++;
        }
        max=0;
        int output=arr[0];
         for(int i=0;i<arr.length;i++){
             int temp = arr[i];
             int count = freArray[temp];
             if(count>max){
                 max=count;
                 output = temp;
             }
            
        }

        return output;
    }
}