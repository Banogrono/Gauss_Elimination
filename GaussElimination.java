
public class GaussElimination {

     double[][] equationMatrix; // 
     double[] answers;

    GaussElimination(double[][] augmentedMatrix) {
        equationMatrix = augmentedMatrix;
        answers = new double[equationMatrix.length];

    }

    private void makeMatrixDiagonal() { // works
        int shiftPivot = 0;
        for (int row = 0; row < equationMatrix.length; row++) {
            double pivot = equationMatrix[shiftPivot][shiftPivot];
            if (row != 0 && equationMatrix[row][shiftPivot] != 0) {
                double temp = equationMatrix[row][shiftPivot] / pivot;
                for (int column = 0; column < equationMatrix[0].length; column++) {
                    equationMatrix[row][column] -= equationMatrix[shiftPivot][column] * temp;
                }
            }
            if (row == equationMatrix.length - 1 && shiftPivot != equationMatrix.length - 1) {
                shiftPivot++;
                row = shiftPivot;
            }
        }
    }

    private void backElimination() {
        int size = equationMatrix.length;
        for (int i = size - 1; i >= 0; i--) {
            double sum = 0f;
            for (int j = 0; j < size; j++) {
                sum += (equationMatrix[i][j]) * answers[j];
            }
            answers[i] = (equationMatrix[i][size] - sum) / equationMatrix[i][i];
        }
    }

    private void printAnswers() {
        int i = 1;
        for (double x : answers) {
            System.out.printf("X_%d = %10.4f\n", i, x);
            i++;
        }
    }

    private void printMatrix() {
        for (int i = 0; i < equationMatrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < equationMatrix[0].length; j++) {
                System.out.printf("%10.4f", equationMatrix[i][j]);
                if (j < equationMatrix[0].length - 2) System.out.print(", ");
                if (j == 2 && i == 1) System.out.print("  |   =   |");
                else if (j == equationMatrix[0].length - 2) System.out.print("  |       |");

            }
            System.out.print("   |");
            System.out.println();
        }
    }

    public void solve() {
        makeMatrixDiagonal();
        printMatrix();
        backElimination();
        printAnswers();
    }

}

