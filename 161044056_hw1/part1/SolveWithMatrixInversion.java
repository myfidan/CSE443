/**
 * My second behaviour solve equation by using Matrix Inversion
 */
public class SolveWithMatrixInversion implements SolveBehavior{

    /**
     * For my equations result array and coefficients array
     */
    protected double[] equationResults;
    protected double[][] equationCoefficients;

    /**
     * Constructer just compy argumments to data fields
     * @param equationResults equetion result array
     * @param equationCoefficients equation coefficients array
     */
    public SolveWithMatrixInversion(double[] equationResults, double[][] equationCoefficients) {
        this.equationResults = new double[equationResults.length];
        this.equationCoefficients = new double[equationCoefficients.length][equationCoefficients.length];

        for(int i=0; i<equationResults.length; i++){
            this.equationResults[i]= equationResults[i];
        }

        for(int i=0; i< equationCoefficients.length;i++){
            for(int j=0; j<equationCoefficients[i].length; j++){
                this.equationCoefficients[i][j] = equationCoefficients[i][j];
            }
        }
    }

    /**
     * Find determinant of 2D equation coefficients array
     * @param my_matrix equation coefficients
     * @param det determinant itself for recursive calls
     * @return determinant of equationCoefficienrs array
     */
    public double findDeterminant(double[][] my_matrix,double det){
        if(my_matrix.length == 1){
            return my_matrix[0][0];
        }
        else if(my_matrix.length == 2){
            return (my_matrix[0][0]*my_matrix[1][1])-(my_matrix[0][1]*my_matrix[1][0]);
        }
        else{//cofactor method
            for(int i=0; i<my_matrix.length; i++){
                double[][] new_arr = new double[my_matrix.length-1][my_matrix.length-1];
                for(int k=1; k<my_matrix.length; k++){
                    int right_index =0;
                    for(int j=0; j<my_matrix.length; j++){
                        if(j != i){
                            new_arr[k-1][right_index]= my_matrix[k][j];
                            right_index++;
                        }

                    }
                }
                det += Math.pow(-1,i)*my_matrix[0][i]*findDeterminant(new_arr,det);
            }
        }
        return det;
    }

    /**
     * Create adjoin Matrix
     * so using adjoin matrix and determinant I can find inverse matrix
     * @return adjoin Matrix
     */
    public double[][] adjoinMatrix(){

        double[][] adjoinMatrix = new double[equationCoefficients.length][equationCoefficients.length];


        for(int i=0; i<equationCoefficients.length; i++){
            for(int j=0; j<equationCoefficients[i].length; j++){
                double[][] temp = new double[equationCoefficients.length-1][equationCoefficients.length-1];
                int row = 0;
                for(int a=0; a<equationCoefficients.length; a++){
                    int colm = 0;
                    for(int b=0; b<equationCoefficients.length; b++){

                        if(a!=i && b!=j){
                            temp[row][colm++] = equationCoefficients[a][b];
                        }
                    }
                    if(a != i){
                        row++;
                    }
                }

                adjoinMatrix[i][j] = Math.pow(-1,i+j)*findDeterminant(temp,0);
            }
        }

        return adjoinMatrix;
    }

    /**
     * Solve equation by Matrix Inversion method
     */
    @Override
    public void solve() {
        System.out.println("\nSolving by using matrix inversion");
        double det = findDeterminant(equationCoefficients,0);
        if(det == 0){
            System.out.println("Not solvable");
            return;
        }
        System.out.println("Det: "+ det);
        double[][] adj= adjoinMatrix();

        double[][] trampose = new double[adj.length][adj.length];
        double[][] inverseMatrix = new double[adj.length][adj.length];

        for(int i=0; i<trampose.length; i++){
            for(int j=0; j<trampose.length; j++){
                trampose[i][j] = adj[j][i];
                inverseMatrix[i][j]=(trampose[i][j]/det);
            }

        }
        System.out.println("Variable results:");

        for(int i=0; i<inverseMatrix.length; i++){
            double sum = 0;
            for(int j=0; j<inverseMatrix.length; j++){
                sum += inverseMatrix[i][j]*equationResults[j];
            }
            System.out.print(sum+" ");
        }
    }
}
