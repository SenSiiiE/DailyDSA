// Java implementation to return
// an array of its anti-diagonals
// when an N*N square matrix is given

class Matrix {

    // function to print the diagonals
    void diagonal(int A[][])
    {

        int N = 3;

        // For each column start row is 0
        for (int col = 0; col < N; col++) {

            int startcol = col, startrow = 0;

            while (startcol >= 0 && startrow < N) {

                System.out.print(A[startrow][startcol]
                        + " ");

                startcol--;

                startrow++;
            }
            System.out.println();
        }

        // For each row start column is N-1
        for (int row = 1; row < N; row++) {
            int startrow = row, startcol = N - 1;

            while (startrow < N && startcol >= 0) {
                System.out.print(A[startrow][startcol]
                        + " ");

                startcol--;

                startrow++;
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String args[])
    {

        // matrix initialisation
        int A[][]
                = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        Matrix m = new Matrix();

        m.diagonal(A);
    }
}

