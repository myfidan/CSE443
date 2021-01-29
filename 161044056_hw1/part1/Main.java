import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	// Read equations from user part
    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of unknown variable:");
		int numberOfVariable = scan.nextInt();

		double[][] deneme = new double[numberOfVariable][numberOfVariable];
		double[] deneme2 = new double[numberOfVariable];
		System.out.println("Enter equations coefficients:");
		for (int i=0; i<deneme.length; i++){
			for(int j=0; j<deneme[i].length; j++){
				deneme[i][j] = scan.nextInt();;
			}
		}
		System.out.println("Enter equations solutions:");
		for(int i=0; i<deneme2.length; i++){
			deneme2[i] = scan.nextInt();;
		}

		//Create my equations solver with GaussElimination
    	EquationSolver solver = new LinearSolver(new SolveWithGaussElimination(deneme2,deneme));
	    solver.solveEquation();


	    //Change solver method from Gauss to MatrixInversion dynamically
	    solver.setSolverBehaviour(new SolveWithMatrixInversion(deneme2,deneme));
	    solver.solveEquation();

    }
}
