class Solution {
    public int[] twoSum(int[] nums, int target) {

int[] r=new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(j!=i && (nums[j]+nums[i]==target)){
                  if(j<i){
                    r[0]=j;
                    r[1]=i;
                  }  else{
                    r[0]=i;
                    r[1]=j;
                  }
                }
            }
        }
        return r;
    }
}
