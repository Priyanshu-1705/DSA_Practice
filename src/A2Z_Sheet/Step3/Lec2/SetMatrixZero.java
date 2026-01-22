package A2Z_Sheet.Step3.Lec2;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    static int[][] setMatrixZero(int[][] matrix){
        //Brute force
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] ==0){
//                    for (int k = 0; k < matrix.length; k++) {
//                        if ( matrix[k][j] != 0) matrix[k][j] = -1;
//                    }
//                    for (int k = 0; k < matrix[i].length; k++) {
//                        if (matrix[i][k] == -1) break;
//                        if (matrix[i][k] != 0) matrix[i][k] = -1;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == -1){
//                    matrix[i][j] = 0;
//                }
//            }
//        }

        //Better approach
//        boolean[] row = new boolean[matrix.length];
//        boolean[] col = new boolean[matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] ==0){
//                   row[i] = true;
//                   col[j] = true;
//                }
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (row[i] || col[j]){
//                    matrix[i][j] = 0;
//                }
//            }
//        }

        //Optimal approach
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    //mark the ith row
                    matrix[i][0] = 0;
                    //mark the jth col
                    if (j!=0){
                        matrix[0][j] = 0;
                    }else col0 = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length ; j++) {
                if (matrix[i][j] != 0){
                    if (matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if (matrix[0][0] == 0){
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < matrix.length ; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3,4,5,2},
                {0,1,2,0},
                {1,3,1,5}
        };
        setMatrixZero(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
