
public class LinearSolver extends EquationSolver{
    /**
     * @param solveBehavior take behaviour as argument so it can change
     *  behaviour easy
     */
    LinearSolver(SolveBehavior solveBehavior){
        this.solverBehaviour = solveBehavior;
    }

    /**
     * Call corresponding solve method
     */
    public void solveEquation(){
        solverBehaviour.solve();
    }


}
