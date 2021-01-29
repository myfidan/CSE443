/**
 * State Interface, other state concrete classes will implement this interface
 */
public interface State {
    void switchGreen();
    void switchRed();
    void switchYellow();
}
