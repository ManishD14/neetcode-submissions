class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> count= new HashMap<>();

        for(int v:nums){
            if(count.containsKey(v)){
                count.put(v,count.get(v)+1);
                if(count.get(v)>=2){
                    return true;
                }
            }else{
                count.put(v,1);
            }
        }
        return false;
        
    }
}