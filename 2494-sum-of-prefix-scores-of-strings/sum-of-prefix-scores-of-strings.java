class Solution {
     public static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        int count;

        Node(){

            for(int i=0;i<26;i++){
                children[i]=null;
            }
            count=1;
        }
    }

    public static void insert(String word,Node root){
        Node curr =root;

        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();

            }else{
                curr.children[idx].count++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static int getScore(String word,Node root){
        Node curr=root;
        int sum=0;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]!=null){
                sum+=curr.children[idx].count;
            }
            curr=curr.children[idx];
        }
        return sum;
    }
    public static int[] sumPrefixScores(String[] words) {
       Node root=new Node();

       for(int i=0;i<words.length;i++){
           insert(words[i],root);
       }
       int res[]=new int[words.length];

        for(int i=0;i<res.length;i++){
            res[i]=getScore(words[i],root);
        }
      return res;
    }
}