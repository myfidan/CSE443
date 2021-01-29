/**
 * Command interface
 * All commands should implement this so they have to
 * override execute and undo methods
 */
public interface Command {
    boolean execute();
    void undo();
}
