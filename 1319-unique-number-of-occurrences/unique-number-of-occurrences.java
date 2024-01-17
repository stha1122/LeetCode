import java.util.*;
class Solution {
public boolean uniqueOccurrences(int[] arr) {
Arrays.sort(arr);
ArrayList arl=new ArrayList<>();

    int c=1;
    
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]==arr[i+1])
            c++;
        
        else
        {
            arl.add(c);
            c=1;
        }
        
    }
    
    arl.add(c);
    
    Collections.sort(arl);
    
    
    for(int i=0;i<arl.size()-1;i++)
    {
        if(arl.get(i)==arl.get(i+1))
            return false;
    }
    
    return true;
    
}
}