class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=word1.length();
        int y=word2.length();
        while(i<j&& i<y){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while(i<j){
            sb.append(word1.charAt(i));
            i++;
        }
        while(i<y){
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}