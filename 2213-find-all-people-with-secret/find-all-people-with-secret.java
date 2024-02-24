class Solution {
    private static class Dsu {
        private final int[] p;
        private final int[] sz;

        public Dsu(int n) {
            p = new int[n];
            sz = new int[n];
            for (int i = 0; i < n; ++i) {
                p[i] = i;
                sz[i] = 1;
            }
        }

        public void reset(int i) {
            --sz[get(i)];
            p[i] = i;
            sz[i] = 1;
        }

        public int get(int i) {
            if (p[i] != i) {
                p[i] = get(p[i]);
            }
            return p[i];
        }

        public void merge(int l, int r) {
            l = get(l);
            r = get(r);
            if (l == r) {
                return;
            }
            if (sz[l] < sz[r]) {
                int t = l; l = r; r = t;
            }
            p[r] = l;
            sz[l] += sz[r];
        }
    }

    private static List<int[]>[] groupMeetingsByTime(int[][] meetings) {
        int maxTime = 0;
        for (int[] ppt : meetings) {
            maxTime = Math.max(maxTime, ppt[2]);
        }
        List<int[]>[] timeToMeetings = new List[maxTime + 1];
        for (int[] ppt : meetings) {
            int time = ppt[2];
            if (timeToMeetings[time] == null) {
                timeToMeetings[time] = new ArrayList<>();
            }
            timeToMeetings[time].add(ppt);
        }
        return timeToMeetings;
    }

    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Dsu dsu = new Dsu(n);
        dsu.merge(0, firstPerson);
        for (List<int[]> meetingsAtTime : groupMeetingsByTime(meetings)) {
            if (meetingsAtTime == null) {
                continue;
            }
            for (int[] xyt : meetingsAtTime) {
                dsu.merge(xyt[0], xyt[1]);
            }
            int c0 = dsu.get(0);
            for (int[] xyt : meetingsAtTime) {
                if (dsu.get(xyt[0]) != c0) {
                    dsu.reset(xyt[0]);
                    dsu.reset(xyt[1]);
                }
            }
        }
        List<Integer> peopleWithSecret = new ArrayList<>();
        for (int i = 0, c0 = dsu.get(0); i < n; ++i) {
            if (dsu.get(i) == c0) {
                peopleWithSecret.add(i);
            }
        }
        return peopleWithSecret;
    }
}