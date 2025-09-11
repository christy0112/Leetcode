class Solution {
    public int findMin(int[] nums) {
        // First, get the index where the rotation happened
        int pivotIndex = getPivotIndex(nums);

        // The number at pivot is the smallest — the poor thing was pushed to the front
        return nums[pivotIndex];
    }

    public int getPivotIndex(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // CASE 1: Mid is greater than next — rotation detected!
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid + 1;

            // CASE 2: Mid is less than previous — rotation detected backwards!
            if(mid > start && nums[mid - 1] > nums[mid])
                return mid;

            // CASE 3: Left part is sorted, go right
            if(nums[mid] >= nums[start]){
                start = mid + 1;
            } 
            // CASE 4: Right part is sorted, go left
            else {
                end = mid - 1;
            }
        }

        // If you reach here, the array was never rotated. Lazy array. Just return 0.
        return 0;
    }
}