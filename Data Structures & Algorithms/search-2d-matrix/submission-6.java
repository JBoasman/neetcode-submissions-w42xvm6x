class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int width = matrix[0].length;
        int height = matrix.length;
        int min = 0;
        int max = (width * height) - 1;
        
        while (min <= max) {
            int mid = min + ((max - min) / 2);
            int midValue = valueAtIndex(matrix, mid, width);
            if ( midValue == target) {
                return true;
            } else if (midValue < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return false;
    }

    public int valueAtIndex(int[][] matrix, int z, int width) {
        int x = z % width;
        int y = z / width;
        return matrix[y][x];
    }
}
