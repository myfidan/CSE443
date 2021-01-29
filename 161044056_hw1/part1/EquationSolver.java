public abstract class EquationSolver {

    protected SolveBehavior solverBehaviour;


    public abstract void solveEquation();

    /**
     * I need this set method if I want to make my system dynamic
     * so in run time you can change behaviour whatever you want
     * @param solverBehaviour behaviour
     */
    public void setSolverBehaviour(SolveBehavior solverBehaviour) {
        this.solverBehaviour = solverBehaviour;
    }
}
