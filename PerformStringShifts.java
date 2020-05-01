public class PerformStringShifts {
    // Leet 14
    public String stringShift(String s, int[][] shift) {
        int totalShift = 0;
        for (int i = 0; i < shift.length; i++) {
            int direction = shift[i][0];
            int amount = shift[i][1];

            if (direction == 0) {
                // left shift
                totalShift -= amount;
            } else {
                totalShift += amount;
            }
        }
        String newFont = "";
        String newBack = "";
        if (totalShift < 0) {
            // left shift
            // adbcde -> left shift by 2
            // newFont = bcde - newBack = ab
            totalShift = Math.abs(totalShift) % s.length();
            newFont = s.substring(totalShift);
            newBack = s.substring(0, totalShift);

        } else if (totalShift > 0) {
            // right shift
            // abcde -> right shift by 2
            // font = de - back = abc
            totalShift = Math.abs(totalShift) % s.length();
            newFont = s.substring(s.length() - totalShift);
            newBack = s.substring(0, s.length() - totalShift);
        } else {
            return s;
        }
        return newFont + newBack;
    }

}
