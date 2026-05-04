class Solution {
    public boolean isPalindrome(String s,int i,int j) {
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            char x=s.charAt(i);
            char y=s.charAt(j);
            if(Character.toLowerCase(x)!=Character.toLowerCase(y)){
                return false;
            }
            i++;
            j--;
        } 
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            char x=s.charAt(i);
            char y=s.charAt(j);
            if(Character.toLowerCase(x)!=Character.toLowerCase(y)){
                if(isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1)){
                    return true;
                }
                else{
                    return false;
                }
            }
            i++;
            j--;
        }
        return true; 
    }
}