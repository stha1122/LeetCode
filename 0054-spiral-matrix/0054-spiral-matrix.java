class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, down = matrix.length - 1, top = 0;

        while (true) {
            for (int i = top; i <= right; i++)
                l.add(matrix[left][i]);
            left++;
            if (left > down)
                break;
            for (int i = left; i <= down; i++)
                l.add(matrix[i][right]);
            right--;
            if (top > right)
                break;
            for (int i = right; i >= top; i--)
                l.add(matrix[down][i]);
            down--;
            if (left > down)
                break;
            for (int i = down; i >= left; i--)
                l.add(matrix[i][top]);
            top++;
            if (top > right)
                break;
        }

        return l;
    }
}