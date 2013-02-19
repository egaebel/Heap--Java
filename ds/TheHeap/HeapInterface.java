package ds.TheHeap;

/**
 * Generic Heap interface. Defines the standard heap methods.
 * 
 * @author Ethan Gaebel (egaebel)
 *
 */
public interface HeapInterface<T extends Comparable<?>> {

    /**
     * Inserts the passed in element into the heap.
     * 
     * @param element the element to be inserted into the heap.
     */
    public void insert(T element);
    /**
     * Finds the element that is the most significant of the elements in the heap.
     * Depends on the heuristic that is used to organize the heap.
     * 
     * e.x. if the heap is a min heap, finds the minimum element.
     * e.x.2. if the heap is a max heap, finds the maximum element. 
     * 
     * @return the "significant" element.
     */
    public T getHead();
    /**
     * Finds and deletes the element that is the most significant of the elements in the heap.
     * Depends on the heuristic that is used to organize the heap.
     * 
     * e.x. if the heap is a min heap, finds and deletes the minimum element.
     * e.x.2. if the heap is a max heap, finds and deletes the maximum element. 
     * 
     * @return the "significant" element.
     */
    public T deleteHead();
    /**
     * Checks to see if the heap is empty. 
     * Returns true if it is, false otherwise.
     * 
     * @return true if the heap is empty, false otherwise.
     */
    public boolean isEmpty();
    /**
     * Removes all elements from the heap.
     */
    public void makeEmpty();
    /**
     * Returns a string representation of the heap.
     * 
     * @return the String representing the heap.
     */
    public String printHeap();
    /**
     * Gets the size of the heap.
     * 
     * @return the size of the heap.
     */
    public int size();
}