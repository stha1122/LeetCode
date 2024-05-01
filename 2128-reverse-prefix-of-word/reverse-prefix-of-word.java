class Solution {
    public String reversePrefix(String word, char ch) {
        int temp = -1;
        for(int i=0;i<word.length();i++){
            char a = word.charAt(i);
            if(a==ch){
                temp =i; 
                break;
            }
            
        }
        if(temp==-1){
            return word;
        }
        String newWord = "";
        for(int i=temp;i>=0;i--){
            char a = word.charAt(i);
            newWord+=a;
            // System.out.println(newWord);
        }

        for(int i=temp+1;i<word.length();i++){
            char a = word.charAt(i);
            newWord+=a;
        }

        return newWord;
    }
}