public class SearchInRotatedSortedArray {
    // Leet 19
    // Using binary search
    public int search(int[] nums, int target){
        // check empty array
        if (nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] >= nums[start]){          // the left half
                if (target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {                                // the right half
                if (target >= nums[mid] && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
