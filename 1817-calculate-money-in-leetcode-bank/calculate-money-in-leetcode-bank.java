class Solution {
    public int totalMoney(int n) {
        int count = 0;
        int start = 1, dayM = start, weekM = 0, totalM = 0;

        for (int i = 0; i < n; i++) {
            if (count == 7) {
                totalM += weekM;
                count = 0;
                start += 1;
                weekM = 0;
                dayM = start;
            }

            weekM += dayM;
            dayM += 1;
            count++;
        }

        // Add the remaining weekM if the loop finishes before reaching n days
        totalM += weekM;

        return totalM;
    }
}
