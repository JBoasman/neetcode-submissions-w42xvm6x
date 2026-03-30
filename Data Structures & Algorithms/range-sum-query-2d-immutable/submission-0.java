class NumMatrix {

    public int[][] colSumMatrix;
   
    public NumMatrix(int[][] matrix) {
        //dimensions and empty check
        int height = matrix.length;
        if (height == 0) { return; }
        int width = matrix[0].length;
        colSumMatrix = new int[height][width];
        
        //summing across rows
        int[][] rowSumMatrix = new int[height][width]; 
        for (int y = 0; y < height; y++) {
            rowSumMatrix[y] = rowSum(matrix[y], width);
        }
       
        //summing down cols 
        int[] prevRow = new int[width];
        for (int y = 0; y < height; y++) {
            colSumMatrix[y] = colSum(prevRow, rowSumMatrix[y], width);
            prevRow = colSumMatrix[y];
        }
        

    }

    public int[] rowSum(int[] row, int width) {
        int[] rowOfSums = new int[width];
        int rowSum = 0;
        for (int x = 0; x < width; x++) {
            rowOfSums[x] = row[x] + rowSum;
            rowSum = rowSum + row[x]; 
        }
        return rowOfSums;
    }

    public int[] colSum(int[] prevRow, int[] row, int width) {
        int[] rowOfColSums = new int[width];
        int colSum = 0;
        for (int x = 0; x < width; x++) {
            rowOfColSums[x] = row[x] + prevRow[x];
        }
        return rowOfColSums;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int rowsToRemove;
        int colsToRemove;
        int doubleToAdd;

        if (row1 != 0) {
            rowsToRemove = colSumMatrix[row1-1][col2];
        } else {
            rowsToRemove = 0;
        }
        if (col1 != 0) {
            colsToRemove = colSumMatrix[row2][col1-1];
        } else {
            colsToRemove = 0;
        }
        if (row1 == 0 || col1 == 0) {
            doubleToAdd = 0;
        } else {
            doubleToAdd = colSumMatrix[row1-1][col1-1];
        }
        return colSumMatrix[row2][col2] - rowsToRemove - colsToRemove + doubleToAdd;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */