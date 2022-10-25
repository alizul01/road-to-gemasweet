package leetcode.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static List<Integer> arr = new ArrayList<Integer>();

    public static void main(String[] args) {
        int q [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralOrder(q);
        System.out.println(arr);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        
        solve(matrix, 0, 0, arr);
        return arr;
    }
    
    public static int solve(int [][] matrix, int i, int j, List<Integer> ans) {
        
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