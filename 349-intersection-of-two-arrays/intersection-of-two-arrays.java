class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersect = new HashSet<>(); 
        int length1 = nums1.length;
        int length2 = nums2.length;


        for(int i = 0; i < length1; i++){
            for(int j = 0; j < length2; j++){
                if (nums1[i] == nums2[j]){
                    intersect.add(nums1[i]);
                }
            }
        }

        int n = intersect.size();
        int[] intersectArray = new int[n];
        
        for (int i = 0; i < intersectArray.length; i++) {
            intersectArray[i] = intersect.toArray(new Integer[0])[i];
        }

        return intersectArray;
    }
}