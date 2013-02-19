package ds.TheHeap.heuristic;

/**
 * A heuristic used to organize a heap as a max heap that keeps the maximum element
 * at the top of the heap at all times.
 * 
 * @author Ethan Gaebel (egaebel)
 *
 * @param <T>
 */
public class MaxHeap<T extends Comparable<T>> implements HeapHeuristic<T> {

    //~Constants----------------------------------------------


    //~Data Fields--------------------------------------------


    //~Constructors--------------------------------------------


    //~Methods-------------------------------------------------

    @Override
    public int heuristic(T element1, T element2) {

        if (element1 == null && element2 == null) {
            
            return 0;
        }
        else if (element1 == null) {
        
            return -1;
        }
        else if (element2 == null) {
            
            return 1;
        }
        
        return element1.compareTo(element2) * -1;
    }

    @Override
    public String printHeuristic() {

        return "MaxHeap heuristic:\nelement1.compareTo(element2) * -1";
    }
}
