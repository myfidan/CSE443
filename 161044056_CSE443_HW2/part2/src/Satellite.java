import java.util.Iterator;

/**
 * A Interface for satellite classes but here is only 1 satellite in our design(Gokturk)
 * but just implement this interface for creating another Satellite. So this isterface for maintainability
 */
public interface Satellite {
    public Iterator<Integer> createIterator(IteratorType iterType);
}
