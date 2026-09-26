
class Solution{
public int[] topKFrequent(int[] nums, int k) {
    int[] result= new int[k];
    int counter =0;
    //create hashmap
    HashMap<Integer, Integer> freq= new HashMap<>();
    for(int num: nums){
        freq.put(num, freq.getOrDefault(num,0)+1);
    }
    List<Integer>[] buckets = new List[nums.length+1];
    //insert into array
    for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
        if(buckets[entry.getValue()]==null) buckets[entry.getValue()]= new ArrayList<>();
        buckets[entry.getValue()].add(entry.getKey());
    }
    //iterate backward

    for(int i =nums.length; counter!=k; i--){
        if(buckets[i]!=null){
            for(int num: buckets[i]){
                result[counter]=num;
                counter++;
            }
        }
    }
    return result;

}
}



