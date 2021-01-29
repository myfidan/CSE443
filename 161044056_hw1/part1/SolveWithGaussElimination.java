/**
 * My first behaviour solve linear system by using Gauss Elimination method
 */
public class SolveWithGaussElimination implements SolveBehavior {

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
    public SolveWithGaussElimination(double[] equationResults, double[][] equationCoefficients) {
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
     * Solve equation by using gauss method and print variable values
     */
    @Override
    public void solve() {
        System.out.println("Solving by using Gauss Elimination");
        int row = equationCoefficients.length;
        int colm = row;
        double[] result = new double[row];


        for(int i=0; i<row; i++){
            boolean valid_check=false;
            for(int j=0; j<row; j++){
                if(equationCoefficients[i][j] != 0){
                    valid_check = true;
                }
            }
            if(equationResults[i] == 0 && valid_check == false){
                System.out.println("Cannot solve this..");
                return;
            }
        }

        for(int i=0; i<row; i++){
            int max = i;
            for(int j = i+1; j<colm; j++){
                if(Math.abs(equationCoefficients[i][max]) < Math.abs(equationCoefficients[j][i])) max = j;
            }

            //swap
            if(max != i){

               double temp;
               for(int j=0; j<row; j++){
                   temp = equationCoefficients[i][j];
                   equationCoefficients[i][j] = equationCoefficients[max][j];
                   equationCoefficients[max][j] = temp;
               }
               temp = equationResults[max];
               equationResults[max] = equationResults[i];
               equationResults[i] = temp;
            }

            for(int j=i+1; j<row; j++){
                if(equationCoefficients[j][i] != 0){
                    double val =equationCoefficients[j][i]/equationCoefficients[i][i];
                    equationResults[j] -= val * equationResults[i];
                    for(int k=i; k<row; k++){
                        equationCoefficients[j][k] -= val * equationCoefficients[i][k];
                    }
                }
            }


            for(int j=row-1; j>=0; j--){
                double sum = equationResults[j];
                for(int k=j+1; k<row; k++){
                    sum -= result[k]*equationCoefficients[j][k];
                }
                result[j] = sum/equationCoefficients[j][j];
            }
        }


        System.out.println("Gauss matrix:");
        for(int i=0; i<equationCoefficients.length; i++){
            System.out.println();
            for(int j=0; j< equationCoefficients[i].length; j++){
                System.out.print(equationCoefficients[i][j]+" ");
            }
        }
        System.out.println("\nVariable results:");
        for(int i=0; i<row; i++){
            System.out.print(result[i]+" ");
        }
    }
}
