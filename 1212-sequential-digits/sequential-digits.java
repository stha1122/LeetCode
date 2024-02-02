class Solution {
    public List<Integer> sequentialDigits(int low, int high)
    {
        List<Integer> list=new ArrayList<>();    //declaring a list to store all sequential numbers. 
        
        int s=123456789, len=length(s);    //assuming the mentioned int to be s, and its length to be len
        
        int lowlen=length(low), highlen=length(high);    //lengths of low and high
        
        outer:
        for(int x=lowlen; x<=highlen; x++)
        {
            for(int y=0; y<len-x+1; y++)
            {
                int a=s/(int)Math.pow(10,len-x-y);
                a%=(int)Math.pow(10,x);    //this is the final int we want to check if its in the range
                if(a>high)
                    continue outer;    //to avoid extra iterations
                if(a<=high && a>=low)
					list.add(a);    //adding the number to the list if its in the range
            }
        }
        return list;    //returning the list
    }
    int length(int x)    //function to find out the length of the passed int
    {
        return (int)(Math.log10(x) + 1);
        
    }
}