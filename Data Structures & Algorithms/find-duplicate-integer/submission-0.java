class Solution {
    public int findDuplicate(int[] nums) {
        boolean flag = true;
        int slowI=0;
        int fastI= 0;
        while(true){
            slowI=nums[slowI];
            fastI=nums[nums[fastI]];
            if(slowI==fastI) break;
        }
        int finderI=0;
        while(true){
            slowI=nums[slowI];
            finderI=nums[finderI];
            System.out.println("I: "+slowI);
            System.out.println("F: "+ finderI);
            if(slowI==finderI){return finderI;}
        }
    }
}
