class Solution {
    public int reversePairs(int[] arr) {
        return mergeSort(0, arr.length-1, arr);
    }
    
    public int merge(int si, int ei, int[] arr) {
        int count = 0;
        int mid = (si+ei)/2;
        int temp[] = new int[ei-si+1];
        int k = 0, i = si, j = mid+1;
        while(i<=mid){
                while(j<=ei && arr[i] > 2*(long)arr[j]) j++;
                count += (j-(mid+1));
                i++;
        }
        i = si;
        j = mid+1;
        while(i <= mid && j <= ei){
            if(arr[i]<arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while(i <= mid ){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        k = 0;
        i = si;
        while(i<=ei){
            arr[i++] = temp[k++];
        }
        return count;
    }
    public int mergeSort(int si, int ei, int[] arr) {
        int count = 0;
        if(si<ei){
            int mid = (si+ei)/2;
            count += mergeSort(si, mid, arr);
            count += mergeSort(mid+1, ei, arr);
            count += merge(si, ei, arr);
        }
        return count;
    }
}