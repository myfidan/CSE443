/**
 * 6 phone part(Display,CpuRam,Battery,Storage,Case,Camere) will extend this class
 */
public abstract class PhonePart {
    protected String mainPart;
    protected String specification;

    @Override
    public String toString() {
        return mainPart + specification;
    }
}
