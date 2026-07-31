class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sCounter = new HashMap<>();
        Map<Character, Integer> tCounter = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i =0; i<sArr.length;i++){
            sCounter.put(sArr[i], sCounter.getOrDefault(sArr[i], 0)+1);
        }
        for(int i =0; i<tArr.length;i++){
            if(!sCounter.containsKey((tArr[i]))) return false;
            tCounter.put(tArr[i], tCounter.getOrDefault(tArr[i], 0)+1);
        }
        for(Character key: sCounter.keySet()){
            if(!Objects.equals(sCounter.get(key), tCounter.get(key))) return false;
        }
        return true;
    }
}
