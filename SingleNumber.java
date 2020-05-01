public class SingleNumber {
    public int isSingle(int[] nums){
        int result = 0;
        for(Integer num : nums){
            // XOR operator
            result = result ^ num;
        }
        return result;
    }
}
