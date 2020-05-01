public class MoveZeroes {
    // Leet 4
    public void moveZeroes(int[] nums){
        // thay doi vi tri phan tu khac 0 trong mang bang bien index
        int index =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){ // diff 0 then move this digit to start of array
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
