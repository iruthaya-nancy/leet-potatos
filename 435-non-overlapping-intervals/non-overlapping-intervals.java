import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Step 1: Sort intervals based on the end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int nonOverlapping = 1; // Count the first interval as non-overlapping
        int prevEnd = intervals[0][1]; // Track the last non-overlapping interval's end time

        // Step 2: Iterate through intervals and count removals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= prevEnd) {
                // Non-overlapping case: Update the previous end
                prevEnd = intervals[i][1];
                nonOverlapping++;
            }
        }

        // Step 3: Calculate the number of removals
        return intervals.length - nonOverlapping;
    }
}
