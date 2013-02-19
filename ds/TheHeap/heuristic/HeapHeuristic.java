package ds.TheHeap.heuristic;

/**
 * A Heuristic class with two functions. One which performs the operation
 * that is used to order the heap, and compare two elements. The other method
 * returns a string that describes the particular heuristic (either mathematically or verbally).
 *  
 * @author Ethan Gaebel (egaebel)
 *
 */
public interface HeapHeuristic<T extends Comparable<T>> {

    /**
     * The heuristic function that performs comparisons for the heap.
     * 
     * @param element1 the first element to compare.
     * @param element2 the second element to compare.
     * @return int reflecting the result of the comparison between element1 & element2.
     *          I.E. If this is a heuristic comparing element1 to element2 for ordering
     *              by which element is larger the heuristic would return:
     *                  1 if element1 > element2
     *                  0 if element1 == element2
     *                  -1 if element1 < element2
     *          I.E.2. If this is a heuristic comparing element1 to element 2 for ordering
     *              by which element is smaller the heuristic would return:
     *                  1 if element1 < element2
     *                  0 if element1 == element2
     *                  -1 if element1 > element2
     */
    public int heuristic(T element1, T element2);
    
    /**
     * Returns a string representation of the heuristic function. Can be either a mathematical
     * description or a verbal description.
     * 
     * @return the string representation of the heuristic function.
     */
    public String printHeuristic();
}
