class Solution {
    public String customSortString(String order, String s) {
         int arr[]=new int[26];
         for(int i=0;i<s.length();i++){
             arr[s.charAt(i)-'a']++;
         }
         String res="";
         for(int i=0;i<order.length();i++){
             while(arr[order.charAt(i)-'a']>0){
                 res+=order.charAt(i);
                 arr[order.charAt(i)-'a']--;
             }
         }
         for(int i=0;i<s.length();i++){
             if(arr[s.charAt(i)-'a']>0){
                 res+=s.charAt(i);
                  arr[s.charAt(i)-'a']--;
             }
         }
         return res;
    }
}