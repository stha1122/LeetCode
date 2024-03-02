class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        
        int mid = (start + end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
     
        merge(arr,start,mid,end);
    }

    public static void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end-start+1];
        int left = start;int right = mid+1;
        int i=0;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                i++;
                left++;
                    }
            else{
                 temp[i]=arr[right];
                i++;
                right++;
            }
        }
        while(left<=mid){
            temp[i++] = arr[left++];
            
        }

         while(right<=end){
            temp[i++] = arr[right++];
            
        }

          for (int j = 0; j < temp.length; j++) {
        arr[start + j] = temp[j];
    }
    
    }
}