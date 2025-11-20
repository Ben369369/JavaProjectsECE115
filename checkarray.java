import java.util.ArrayList;
import java.util.List;

class Result {

    /**
     * Finds all odd numbers between l and r (inclusive).
     *
     * @param l The left part of the range (start).
     * @param r The right part of the range (end).
     * @return A List of integers containing all odd numbers in the range [l, r].
     */
    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddList = new ArrayList<>();

        // 1. Determine the starting point for iteration.
        // If 'l' is odd, start at 'l'. If 'l' is even, start at 'l + 1'.
        int start = l;
        if (start % 2 == 0) {
            start = l + 1;
        }

        // 2. Iterate through the range, incrementing by 2 to get only odd numbers.
        // The loop continues as long as the current number is less than or equal to 'r'.
        for (int i = start; i <= r; i += 2) {
            oddList.add(i);
        }

        return oddList;
    }

    /*
    // Alternate Implementation using a direct loop and check:
    public static List<Integer> oddNumbers_Alternate(int l, int r) {
        List<Integer> oddList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            // Check if the number is odd (i % 2 != 0)
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }
        return oddList;
    }
    */
}