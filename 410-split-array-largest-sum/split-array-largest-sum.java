class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // binary search:
        while (start < end){
            // try for middle as potential answer:
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if (sum + num > mid){
                    // cannot add this in this subarray, create new one
                    sum = num; 
                    pieces++;
                    
                }else{
                    sum += num;
                }
            }

            if (pieces > k){
                start = mid + 1;
            }else{
                end = mid; 
            }

        }
        return end;
    }

}