package DailyQuestion;

public class transposeQ {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,6,7},
                {8,9,10}
        };
        System.out.println(transpose(matrix));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] output = new int [matrix.length][];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                output[i][j]=0;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                if(i!=j){
                    output[i][j] = matrix[j][i];
                }
            }
        }
        return output;
    }
}
