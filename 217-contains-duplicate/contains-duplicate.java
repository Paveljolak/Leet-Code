class Solution {
    public boolean containsDuplicate(int[] nums) {


        HashMap<Integer, Integer> unique = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(unique.containsKey(nums[i])){
                return true;
            }
            unique.put(nums[i], nums[i]);
        }
        return false;

    }
}