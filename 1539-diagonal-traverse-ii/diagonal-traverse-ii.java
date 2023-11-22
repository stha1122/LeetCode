class Pair {
    int x;
    int y;
    
    Pair (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        // Store the result elements in ArrayList
        ArrayList<Integer> res = new ArrayList<>();
        
        // Use a queue to perform BFS traversal
        Queue<Pair> q = new LinkedList<>();
        
        // Get the number of rows in the 2D array
        int n = nums.size();
        
        // Start the traversal from the top-left corner (0, 0)
        q.offer(new Pair(0, 0));
        
        // Perform BFS traversal
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int r = cur.x, c = cur.y;
            
            // Get the number of columns in the current row
            int m = nums.get(r).size();
            
            // Add the current element to the result
            res.add(nums.get(r).get(c));
            
            // Check if there is an element in the next row
            if (r + 1 < n && c == 0) {
                q.offer(new Pair(r + 1, c));
            }
            
            // Check if there is an element in the same row but in the next column
            if (c + 1 < m) {
                q.offer(new Pair(r, c + 1));
            }
        }
        
        // Convert the ArrayList to an array for the final result
        n = res.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = res.get(i);
        }
        
        // Return the final result array
        return arr;
    }
}
