class Solution {
    public String reverseVowels(String s) {
   char[] c = s.toCharArray();
    char t;
    int i=0;
    int j=s.length()-1;
    
    while(i<j){
        if((c[i]=='a' || c[i]=='e'|| c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E'|| c[i]=='I' || c[i]=='O' || c[i]=='U') && (c[j]=='a' || c[j]=='e'|| c[j]=='i' || c[j]=='o' || c[j]=='u' || c[j]=='A' || c[j]=='E'|| c[j]=='I' || c[j]=='O' || c[j]=='U')){
            t=c[i];
            c[i]=c[j];
            c[j]=t;

            i++;
            j--;
            
            
        }
        else {
            if(!(c[i]=='a' || c[i]=='e'|| c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E'|| c[i]=='I' || c[i]=='O' || c[i]=='U')){
            
            
            i++;
        }
          if(!(c[j]=='a' || c[j]=='e'|| c[j]=='i' || c[j]=='o' || c[j]=='u' || c[j]=='A' || c[j]=='E'|| c[j]=='I' || c[j]=='O' || c[j]=='U')){
           j--;
        }
        
        
        }
        
       
    }
    if (s.length()==1)
     return s;
     else
    return new String(c);


    }
}