class Solution {
    public int search(int[] nums, int target) {

        int pivotIndex = findPivot(nums);
        
        // No pivot:
        if(pivotIndex == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // pivot found:
        // meaning two ascending arrays:
        if(nums[pivotIndex] == target){
            return pivotIndex;
        }

       
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivotIndex-1);
        }

        return binarySearch(nums, target, pivotIndex + 1, nums.length-1);
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}