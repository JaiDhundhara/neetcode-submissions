class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=word1.length();
        int x=0;
        int y=word2.length();
        while(i<j&& x<y){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(x));
            i++;
            x++;
        }
        while(i<j){
            sb.append(word1.charAt(i));
            i++;
        }
        while(x<y){
            sb.append(word2.charAt(x));
            x++;
        }
        return sb.toString();
    }
}