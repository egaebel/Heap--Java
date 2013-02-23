package ds.TheHeap;

import ds.TheHeap.heuristic.HeapHeuristic;

/**
 * Implementation of a Binary Heap, using an array.
 * Know the heap property for arrays which says that for any element at index i: 
 *      It's left child is at position 2i, it's right child is at position 2i + 1, 
 *      and it's root is at i/2. AWESOME!
 *      Also there is no element at index = 0 in the array; to maintain this property. 
 * The heap holds a heuristic which is used to order the elements within the heap.
 * 
 * @author Ethan Gaebel (egaebel)
 *
 * @param <T>
 */
public class BinaryHeap<T extends Comparable<T>> implements HeapInterface<T> {

    //~Constants----------------------------------------------
    /**
     * The default size to set the heap to.
     */
    private final int DEFAULT_SIZE = 20;

    //~Data Fields--------------------------------------------
    /**
     * The heuristic object that is used to order the heap.
     */
    private HeapHeuristic<T> heuristic;
    /**
     * The array backing the heap.
     */
    private T[] array;
    /**
     * The capacity of the heap.
     */
    private int capacity;
    /**
     * The number of elements currently in the heap.
     */
    private int size;

    //~Constructors--------------------------------------------
    /**
     * BinaryHeap default constructor. 
     * Private so it can NEVER be used.
     */
    @SuppressWarnings("unused")
    private BinaryHeap() {}
    
    /**
     * Constructor that takes the HeapHeuristic that will be used to organize this heap.
     * 
     *  @param theHeuristic the HeapHeuristic object that will be used to organize the heap.
     */
    @SuppressWarnings("unchecked")
    public BinaryHeap(HeapHeuristic<T> theHeuristic) {
        
        heuristic = theHeuristic;
        
        capacity = DEFAULT_SIZE;
        size = 0;
        
        array = (T[]) new Comparable[DEFAULT_SIZE];
    }
    
    /**
     * Constructor that takes the HeapHeuristic that will be used to organize this heap.
     * Also takes a starting capacity.
     * 
     * @param theHeuristic the HeapHeuristic object that will be used to organize the heap.
     * @param theCapacity the starting capacity of the heap.
     */
    @SuppressWarnings("unchecked")
    public BinaryHeap(HeapHeuristic<T> theHeuristic, int theCapacity) {
        
        heuristic = theHeuristic;
        
        capacity = theCapacity;
        size = 0;
        
        array = (T[]) new Comparable[theCapacity];
    }

    //~Methods-------------------------------------------------
    @Override
    public void insert(T element) {

        if (element != null) {
         
            if (size + 1 == capacity) {
                resize();
            }
           
            int index = percolateUp(element);
           
            array[index] = element;

            size++;
        }
    }
    
    /**
     * Percolates up the heap and discovers where the new element belongs, 
     * and returns the index the element belongs in.
     * 
     * @param element the element to find a place for.
     */
    private int percolateUp(T element) {
        
        int hole = size + 1;
        
        //I have array[0] = element because I have to have SOMETHING to compare to when I get to the top of the heap
        for(array[0] = element; heuristic.heuristic(element, array[hole / 2]) < 0; hole /= 2) {
            
            array[hole] = array[hole / 2];
        }
        
        return hole;
    }
    
    /**
     * Resizes the array backing the heap, and therefore, 
     * the heap to have twice the capacity.
     */
    @SuppressWarnings("unchecked")
    private void resize() {
       
        capacity *= 2;
        T[] temp = (T[]) new Comparable[capacity];
        
        for (int i = 0; i < size; i++) {
            
            temp[i] = array[i];
        }
        
        array = temp;
    }

    @Override
    public T getHead() {

        return array[1];
    }

    @Override
    public T deleteHead() {

        if (size != 0) {

            //Remove element.
            T temp = array[1];
            array[1] = array[size];
            size--;
            
            //Fill the newly opened hole.
            percolateDown(1);
            
            return temp;
        }
        
        return null;
    }

    /**
     * Percolates down the heap and finds a new element to fill the hole with.
     * 
     * @param hole the index of the hole in the heap.
     * @return the element to fill the hole with.
     */
    private void percolateDown(int hole) {
        
        int child;
        T temp = array[hole];
        
        for (; hole * 2 <= size; hole = child) {
            
            child = hole * 2;
            if (child != size 
                    && heuristic.heuristic(array[child + 1],array[child]) < 0) {
                child++;
            }
            if (heuristic.heuristic(array[child], temp) < 0) {
                array[hole] = array[child];
            }
            else {
                break;
            }
        }
        
        array[hole] = temp;
    }    

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void makeEmpty() {

        size = 0;
        array = (T[]) new Comparable[capacity];
    }
    
    @Override
    public String printHeap() {
        
        if (size != 0) {
            StringBuilder build = new StringBuilder();
            
            printHeap(build, 1, "-");
            
            return build.toString();
        }
        else {
            
            return "-";
        }
    }
    
    /**
     * Helper recursive method for printHeap. Traverses down to the rightmost element, 
     * and then prints it; with the help of the properties of a heap in an array.
     *  
     * @param build the StringBuilder object used to concatenate the string together.
     */
    private void printHeap(StringBuilder build, int index, String branch) {
        
        //check if there is a right element. 
        if (2 * index + 1 < size && array[2 * index + 1] != null) {
           
            //if so, follow it.
            printHeap(build, 2 * index + 1, branch + "----");
        }
        //print the item at index, with appropriate formatting.
        build.append(branch).append("|").append(array[index].toString()).append("\n");
        //check if there is a left element
        if (2 * index < size && array[2 * index] != null) {
            
            printHeap(build, 2 * index, branch + "----");
        }
    }

    @Override
    public int size() {

        return size;
    }
}