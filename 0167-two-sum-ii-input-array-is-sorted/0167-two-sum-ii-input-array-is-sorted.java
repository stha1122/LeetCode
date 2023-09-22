class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int [2];
        int L=0;
        int R=numbers.length-1;
        while(L<R){
            if(numbers[L]+numbers[R] == target){
                arr[0]=L+1;
                arr[1]=R+1;
               
                return arr;
            }
            if(numbers[L]+numbers[R] > target){
                R--;
            }
            else{
                L++;
            }
           

        }

         return arr;
    }
}