class Solution {
    public List<Integer> partitionLabels(String s) {
        int start=0,end=0;
        List<Integer> res=new ArrayList<>();
        int[] last=new int[26];
        for(int i=0;i<s.length();i++)
        {
            last[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++)
        {
            end=Math.max(end,last[s.charAt(i)-'a']);
            if(end==i)
            {
            res.add(end-start+1);
            start=end+1;
            }

        }
        return res;
    }
}