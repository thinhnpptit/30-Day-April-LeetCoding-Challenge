public class ProductOfArrayExceptSelf {
    // Leet 15
    public int[] productExceptSelf(int[] nums){

        int n = nums.length;
        int[] output = new int[n];
        output[0] = 1;
        // [ 1 2 3 4 ]
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i-1] * nums[i-1];    // [ 1 1 2 6 ]
        }
        int multi = 1;
        for (int i = n-1; i >= 0; i--){
            output[i] = output[i] * multi;
            multi = multi * nums[i];
            // [ 24 12 8 6 ]
        }
        return output;
    }

}
