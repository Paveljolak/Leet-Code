class Solution {
    public int findNumbers(int[] nums) {

        int counter = 0;
        for(int num : nums){
            String str = Integer.toString(num);
            if(str.length() % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}