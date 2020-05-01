public class BitwiseANDofNumbersRange {
    // Leet 23
    public int rangeBitwiseAnd(int m, int n){
        int shifts = 0;

        while (m < n){

            m >>= 1;        // m = m >> 1
            n >>= 1;        // n = n >> 1
            shifts++;
        }
        return n << shifts;
    }
}

// ex: m = 0110 => m >> 1 = 0011 => m >> 1 = 0001
