import java.util.List;

public class LeftmostColumnWithAtLeastAOne {
    // Leet 21
    public interface BinaryMatrix{
        public int get(int row, int col);
        public List<Integer> dimensions();
    }
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix){

        List<Integer> dimen = binaryMatrix.dimensions();
        int height = dimen.get(0);
        int width = dimen.get(1);

        int result = width;
        for (int i = 0; i < height; i++) {
            while (result > 0 && binaryMatrix.get(height, result-1) == 1 ) {
                result--;
            }
        }
        if (result == width)
            return -1;
        return result;
    }
}
