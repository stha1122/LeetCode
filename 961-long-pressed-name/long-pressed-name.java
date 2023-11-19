class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length();
        int m=typed.length();
        if(n>m)
            return false;
        if(name.charAt(0)!=typed.charAt(0))
            return false;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }
            else if(name.charAt(i-1)==typed.charAt(j))
            {
                j++;
            }
            else 
            return false;

        }
        while(j<m)
        {
            if(name.charAt(i-1)==typed.charAt(j))j++;
            else 
            return false;

        }
        if(i<n)
            return false;

        return true;
    }
}