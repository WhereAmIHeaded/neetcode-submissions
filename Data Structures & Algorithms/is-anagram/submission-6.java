
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if(sArr.length!=tArr.length) return false;
        HashMap<Character, Integer> sHM = new HashMap<>();
        for(int i =0; i<sArr.length; i++){
            sHM.put(sArr[i], sHM.getOrDefault(sArr[i], 0)+1);
        }
        for(int i =0; i<tArr.length; i++){
            Character thisChar = tArr[i];
            if((!sHM.containsKey(thisChar))||sHM.get(thisChar)==0) return false;
            sHM.put(thisChar, sHM.get(thisChar)-1);
        }


        return true;
    }
}
