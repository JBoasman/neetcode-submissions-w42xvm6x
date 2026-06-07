class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int width = matrix[0].length;
        int height = matrix.length;
        int min = 0;
        int max = coordToIndex(matrix, width - 1, height - 1, width);
        int mid = 0;

        while (min <= max) {
            mid = min + ((max - min) / 2);
            if (valueAtIndex(matrix, mid, width) == target) {
                return true;
            } else if (valueAtIndex(matrix, mid, width) < target) {
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

    public int coordToIndex(int[][] matrix, int x, int y, int width) {
        return (y * width) + x;
    }
}
