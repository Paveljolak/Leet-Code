class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        for(int i = 0; i <= length1 - 1; i++){
            for (int j = 0; j <= length2 - 1; j++){
                if(nums1[i] < nums2[j]){
                    break;
                }
                else{
                    if (nums1[i] == nums2[j]){
                     
                        return nums1[i];    
                    }
                }
            }
        }
        return -1;
    }
}