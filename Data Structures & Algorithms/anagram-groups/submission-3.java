class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] newTemplate= new int[26];
            for(char c: str.toCharArray()) newTemplate[c-'a']++;
            String key = Arrays.toString(newTemplate);
            if(map.containsKey(key)) {
                map.get(key).add(str);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
                result.add(temp);
            }
        }
        return result;
    }
}