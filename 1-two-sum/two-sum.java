class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length1 = nums.length;
        int[] returnEquals = {0, 0};

        for(int i = 0; i <= length1 - 1; i++){
            for(int j = 0; j <= length1 - 1; j++){
                if((nums[i] + nums[j] == target) && i != j){
                    returnEquals[0] = i;
                    returnEquals[1] = j;
                    return returnEquals;
                }
            }
        }

        return returnEquals;
    }
    
}