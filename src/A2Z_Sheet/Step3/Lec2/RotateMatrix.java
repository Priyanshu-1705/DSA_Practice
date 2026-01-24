package A2Z_Sheet.Step3.Lec2;
//Ps:48

public class RotateMatrix {
    static void rotateMatrix(int[][] matrix){
        //Brute force
//        int n = matrix.length;
//        int[][] ans = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                ans[j][n-i-1] = matrix[i][j];
//            }
//        }
//        return ans;


        //Optimal approach
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 2},
                {2, 0, 3, 1},
                {4, 5, 0, 5},
                {5, 6, 7, 0}
        };
        rotateMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
