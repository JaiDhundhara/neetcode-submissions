class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> grp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            HashMap<Character,Integer> ana=new HashMap<>();
            for(int j=0;j<strs[i].length();j++){
                ana.put(strs[i].charAt(j),ana.getOrDefault(strs[i].charAt(j),0)+1);
            }
            if(!grp.containsKey(ana)){
                grp.put(ana, new ArrayList<>());
            }
            grp.get(ana).add(strs[i]);
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> words:grp.values()){
            ans.add(words);
        }
        return ans;
    }
}
