package leetcode.spiralMatrix;

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<Integer>();
        solve(matrix, 0, 0, arr);
        return arr;
    }
    
    public int solve(int [][] matrix, int i, int j, List<Integer> ans) {
        
        if (i < 0 || j < 0 || i == matrix.length || j == matrix[i].length || matrix[i][j] == -99) return 0;
        
        if (matrix[i][j] != -99) {            
            ans.add(matrix[i][j]);
            matrix[i][j] = -99;
            solve(matrix, i, j + 1, ans); // kanan
            solve(matrix, i + 1, j, ans); // bawah
            solve(matrix, i, j - 1, ans); // kiri
            solve(matrix, i - 1, j, ans); // atas
        }
        
        return 0;
    }
}